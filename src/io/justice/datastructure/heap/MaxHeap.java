package io.justice.datastructure.heap;

import javax.naming.OperationNotSupportedException;

public class MaxHeap {
	private long[] entries;
	private int entIdx;

	public MaxHeap(int capacity) {
		super();
		this.entries = new long[capacity];
		this.entIdx = 0;
	}

	public long[] getEntries() {
		return entries;
	}

	public void setEntries(long[] entries) {
		this.entries = entries;
	}

	
	public void insert(long value) {
		if(this.entIdx < this.entries.length) {
			entries[this.entIdx++] = value;
			if(this.entIdx > 1) {
			this.heapify(this.entIdx -1);
			}
		} else {
			throw new IndexOutOfBoundsException(this.entIdx + " - Heap is full");
		}
		
		
	}
	
	private void heapify(int i) {
		if(this.entries[this.getParantIndex(i)] > this.entries[i] || i == 0) {
			return;
		} else 
		{
			swap(this.getParantIndex(i), i);
			heapify(this.getParantIndex(i));
		}
		
	}
	
	public long delete(long key) {
		int deletIdx =-1;
		long deletedValue = -1;
		
		for(int i =0; i < this.entIdx; i++) {
			if(this.entries[i] == key) {
				deletIdx = i;
				break;
			}
		}
		
		if(deletIdx != -1) {
			deletedValue = this.entries[deletIdx];
			this.swap(deletIdx, this.entIdx -1);
			this.entIdx--;
			if(this.entries[this.getParantIndex(deletIdx)] < this.entries[deletIdx] ) {
				this.heapify(deletIdx);
			} else {
				this.heapifyDownwards(deletIdx);
			}
			
		}
		
		
		
		return deletedValue;
	}
	
	
	public long deleteV2(int deletIdx) {
		long deletedValue = -1;
		
		if(isEmpty()) {
			throw new IndexOutOfBoundsException(deletIdx + " Heap is empty");
		}
			deletedValue = this.entries[deletIdx];
		
			this.swap(deletIdx, this.entIdx -1);
			this.entIdx--;
			if(this.entries[this.getParantIndex(deletIdx)] < this.entries[deletIdx] ) {
				this.heapify(deletIdx);
			} else {
				this.heapifyDownwards(deletIdx);
			}
		
		
		
		return deletedValue;
	}
	
	public void sort(int seletedIndex ,int endIndex) {
		
		if(isEmpty()) {
			throw new IndexOutOfBoundsException(" Heap is empty - nothimg to sort");
		}
		if(endIndex == 0) {
			return;
		}
			this.swap(seletedIndex, endIndex -1);
			if(this.entries[this.getParantIndex(seletedIndex)] < this.entries[seletedIndex] ) {
				this.heapify(seletedIndex);
			} else {
				this.heapifyDownwardsSort(seletedIndex,endIndex-1);
			}

			sort(0 , endIndex-1);
	}
	
	public long peek() throws OperationNotSupportedException {
		if(isEmpty()) {
			throw new OperationNotSupportedException("heap is empty");
		}
		return this.entries[0];
		
	}
	
	private void heapifyDownwards(int i) {
		if(i >= this.entIdx -1 || (this.getLeftChildIndex(i) < this.entIdx && this.entries[this.getLeftChildIndex(i)] < this.entries[i] && 
				this.getRightChildIndex(i) < this.entIdx && this.entries[this.getRightChildIndex(i)] < this.entries[i]) ) {
			return;
		} else 
		{
			int tempLargestChildIdx = -1;
			
			if(this.getLeftChildIndex(i) < this.entIdx || this.getRightChildIndex(i) < this.entIdx) {
				if(this.getLeftChildIndex(i) < this.entIdx && this.getRightChildIndex(i) < this.entIdx) {
					tempLargestChildIdx = this.entries[this.getLeftChildIndex(i)] >
					this.entries[this.getRightChildIndex(i)]?
							this.getLeftChildIndex(i) : this.getRightChildIndex(i);
				} else if(this.getLeftChildIndex(i) < this.entIdx) {
					tempLargestChildIdx = this.getLeftChildIndex(i);
				} /*
					 * else { tempLargestChildIdx = this.getRightChildIndex(i); }
					 */
				swap(tempLargestChildIdx, i);
				heapifyDownwards(tempLargestChildIdx);
				
			}
			
			
			
		}
		
	}
	
	
	private void heapifyDownwardsSort(int i, int entIdx) {
		if(i >= entIdx -1 || (this.getLeftChildIndex(i) < entIdx && this.entries[this.getLeftChildIndex(i)] < this.entries[i] && 
				this.getRightChildIndex(i) < entIdx && this.entries[this.getRightChildIndex(i)] < this.entries[i]) ) {
			return;
		} else
		{
			int tempLargestChildIdx = -1;
			
			if(this.getLeftChildIndex(i) < entIdx || this.getRightChildIndex(i) < entIdx) {
				if(this.getLeftChildIndex(i) < entIdx && this.getRightChildIndex(i) < entIdx) {
					tempLargestChildIdx = this.entries[this.getLeftChildIndex(i)] >
					this.entries[this.getRightChildIndex(i)]?
							this.getLeftChildIndex(i) : this.getRightChildIndex(i);
				} else if(this.getLeftChildIndex(i) < entIdx) {
					tempLargestChildIdx = this.getLeftChildIndex(i);
				} 
				swap(tempLargestChildIdx, i);
				heapifyDownwardsSort(tempLargestChildIdx,entIdx);
				
			}
			
			
			
		}
		
	}

	private void swap(int par, int cur) {
		if(par == cur) {
			return;
		}
		long tempCur = this.entries[cur];
		this.entries[cur] = this.entries[par];
		 this.entries[par] = tempCur;
		
	}

	private int getParantIndex(int curIdx) {
		return (curIdx -1)/2;
	}
	
	private int getLeftChildIndex(int curIdx) {
		return (2*curIdx + 1); 
	}
	
	private int getRightChildIndex(int curIdx) {
		return (2*curIdx + 2); 
	}
	
	private boolean isFull() {
		return this.entIdx == this.entries.length;
	}

	public int getEntIdx() {
		return entIdx;
	}

	public void setEntIdx(int entIdx) {
		this.entIdx = entIdx;
	}
	
	public boolean isEmpty() {
		return this.entIdx-1 < 0;
	}
	
	public int getChild(int index, boolean left) {
		return 2*index + (left?1:2);
	}
	
	public void printHeap() {
		System.out.println("====");
		for(int i = 0; i <this.entIdx;i++) {
			System.out.print(getEntries()[i] +" ");
		}
		
		System.out.println("\n=====");
	}
	
	
}
