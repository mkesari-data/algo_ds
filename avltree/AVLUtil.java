package com.avltree;

public class AVLUtil {

	BSTEntry root = null;

	/*
	 * ================================================================
	 * findEntry(k): find entry with key k
	 * 
	 * Return: reference to (k,v) IF k is in BST reference to parent(k,v) IF k is
	 * NOT in BST (for put)
	 * ================================================================
	 * Implementation Plan :
	 * 
	 * Note : 
	 * 1. If find that node , otherwise parent node. 
	 * 
	 * 1. Define 2 nodes for reference  current,prev. 
	 * 2. Assign root value to the both the nodes. 
	 * 3. iterate 
	 *        if current == key 
	 *               return current
	 *        else if current < key
	 *                prev=current;
	 *                current = current.left
	 *        else if current > key
	 *                prev=current;
	 *                current = current.right
	 * 
	 * I reached here means , value not appeared . So retrun parent. 
	 * 
	 */
	
	private BSTEntry findEntry(String k) {
	
		BSTEntry current=root;
		BSTEntry prev=root;
		
		while(current!=null) {
			if(k.compareTo(current.key)==0) {
				return current;
			}
			else if(k.compareTo(current.key)<0) {
				prev=current;
				current=current.left;
			}else {
				prev=current;
				current=current.right;
			}
		}
		return prev;
	}
	

	public String get(String k) {
		BSTEntry node=findEntry(k);
		return k.compareTo(node.key)==0 ? node.value:null;
	}

	/* ================================================================
    put(k, v): store the (k,v) pair into the BST

       1. if the key "k" is found in the BST, we replace the val
          that is associated with the key "k"
       1. if the key "k" is NOT found in the BST, we insert
	    a new node containing (k, v)
    ================================================================
      
      ******** Implementation Plan *******  :
    
     * 
     * if root  is null , create new node and make that node as root node. 
     * else
     *   find the node functiona call.  , 
     *         if returned node value and argement key matches then update with the argument value. 
     *         if retruned node value NOT match , then returned node is parent node. So link the current node with parent node. 
     *   Call the height recalculate function. 
     *   
     *    
     *
     *
     */
	
	public void put(String key, String value) {

		BSTEntry node = new BSTEntry(key, value);
		if (root == null) {
			root = node;
			return;
		}

		BSTEntry temp1 = findEntry(key);
		if(key.compareTo(temp1.key)==0) {
			temp1.value=value;
		}else if(key.compareTo(temp1.key)>0){
			temp1.right=node;
			node.parent=temp1;
		}else {
			temp1.left=node;
			node.parent=temp1;
		}

		/**
		 * After New Node insertion we must calculate Height from the new node to root path. 
		 */
		
		recalculateHeight(temp1);
		/**
		 * identify the imbalance position and adjust tree
		 */
		
		identifyImbalanceAndAdjust(node);
		
		
	}
	
	private void identifyImbalanceAndAdjust(BSTEntry node){
		/**
		 * 
		 */
		BSTEntry z=node;
		BSTEntry y=node;
		BSTEntry x=node.parent;
		while(x!=null) {
			
			int leftHeight=(x.left!=null)?x.left.height:0;
			int rightHeight=(x.right!=null)?x.right.height:0;
			
			int hightDiff= (leftHeight>rightHeight)?(leftHeight-rightHeight):(rightHeight-leftHeight);
			if(hightDiff>=1) {
				rebalance(x,y,z);
				break;
			}
			else {
				z=y;
				y=x;
				x=x.parent;
			}
		}
		
	}
	
	private void rebalance(BSTEntry x,BSTEntry  y,BSTEntry z) {
		/**
		 * We need to construct b(Root) a(Left) c(Right) relation. 
		 * 1. First identify is y left or right of x
		 * 2. Seconde identify is z left or right of y. 
		 * 3. We need to identify t0, t1 , t2 and t3 elements to assing b and c. 
		 *  
		 * 4. t0 and t1 will be assinged to b , t2 and t3 will be assinged to c. 
		 */
		
		BSTEntry b,a,c;
		BSTEntry t0,t1,t2,t3;
		
		if(y==x.left && z==y.left) {
			a=z;
			b=y;
			c=x;
			t0=z.left;
			t1=z.right;
			t2=y.left;
			t3=x.right;
		}
		else if(y==x.left && z==y.right) {
			b=z;
			a=y;
			c=x;
			t0=y.left;
			t1=z.left;
			t2=z.right;
			t3=x.right;
		}
		else if(y==x.right && z==y.right) {
			a=x;
			b=y;
			c=z;
			t0=x.left;
			t1=y.left;
			t2=z.left;
			t3=z.right;
		}
		else {
			a=x;
			b=z;
			c=y;
			t0=x.left;
			t1=z.left;
			t2=z.right;
			t3=y.right;
		}
		
		if(x==root) {
			root=b;
		}
		else {
			b.parent=x.parent;
			
			if(x.parent.left==x) {
				x.parent.left=b;
			}else {
				x.parent.right=b;
			}
			
			}
		
		 /* ------------------
        Make:   b
               / \
              a   c
             / \
            T0 T1
        ------------------ */
		
		a.left=t0;
		a.right=t1;
		c.left=t2;
		c.right=t3;
		
	}
	
	
	/**
	 * Purpose is to calculate the height  of the subtree ( New node to Until root node path)
	 * 
	 * Implementation Plan :
	 *  Iterate loop from current node to root node. 
	 *  While iterating. 
	 *     get the left node and right node. 
	 *     get the max height of  left and right node     
	 *     increase one value and assing to the current node.  
	 * 
	 * 
	 * @param temp1
	 */
	private void recalculateHeight(BSTEntry temp1) {
		
		BSTEntry current=temp1;
		while(current!=null) {
			int leftChildHeight=(current.left!=null)?current.left.height:0;
			int rightChildHeight=(current.right!=null)?current.right.height:0;
			current.height=Math.max(leftChildHeight, rightChildHeight)+1;
			current=current.parent;
		}
		
	}

}
