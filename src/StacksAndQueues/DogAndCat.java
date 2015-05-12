package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

class Dog{
	int time;
}

class Cat{
	int time;
}
public class DogAndCat {
	Queue<Object> queue = new LinkedList<>();
	Queue<Dog> dogQueue = new LinkedList<>();
	Queue<Cat> catQueue = new LinkedList<>();
	
	void enqueue(Object object){
		queue.add(object);
	}
	
	Object dequeueAny(){
		if (!dogQueue.isEmpty() && catQueue.isEmpty()) {
			return dogQueue.remove();
		}else if (!catQueue.isEmpty() && dogQueue.isEmpty()) {
			return catQueue.remove();
		}else if (!catQueue.isEmpty() && !dogQueue.isEmpty()) {
			if (catQueue.peek().time < dogQueue.peek().time) {
				return catQueue.remove();
			}else {
				return dogQueue.remove();
			}
		}else{
			return queue.remove();
		}
	}
	
	Cat dequeueCat(){
		if (!catQueue.isEmpty()) {
			return catQueue.remove();
		}
		while (!queue.isEmpty()) {
			Object object = queue.remove();
			if (object.getClass().getName().equals(Cat.class.getName())) {
				return (Cat) object;
			}else {
				dogQueue.add((Dog) object);
			}
		}
		return null;
	}
	
	Dog dequeueDog(){
		if (!dogQueue.isEmpty()) {
			return dogQueue.remove();
		}
		while (!queue.isEmpty()) {
			Object object = queue.remove();
			if (object.getClass().getName().equals(Dog.class.getName())) {
				return (Dog) object;
			}else {
				catQueue.add((Cat) object);
			}
		}
		return null;
	}

}
