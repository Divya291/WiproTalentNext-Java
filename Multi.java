package talentnext;

class Multi extends Thread{
	
	public void run() {
		System.out.println("the thread is involved and it is active");
	}

	public static void main(String[] args) {
		
		Multi t1 = new Multi();
		t1.start();

	}

}
