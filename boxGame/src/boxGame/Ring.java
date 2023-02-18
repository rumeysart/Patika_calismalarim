package boxGame;

public class Ring {

	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
	this.f1 = f1;
	this.f2 = f2;
	this.minWeight = minWeight;
	this.maxWeight = maxWeight;
}

void run() {
	if(isCheck()) {
		while(this.f1.health > 0 && this.f2.health >0) {
            System.out.println("======== YENI ROUND ===========");
            if (whoStart()){
                this.f2.health = this.f1.hit(f2);
                if (this.f2.health < 0)
                    this.f2.health = 0;
                if(isWin()) {
                	System.out.println("Kazanan " + this.f1.name);
                	break;
                }
                this.f1.health = this.f1.hit(f1);
                if(this.f1.health < 0)
                	this.f2.health = 0;
                if(isWin()) {
                	System.out.println("Kazanan: " + this.f2.name);
                }
                printScore();
		}else {
			this.f2.health = this.f1.hit(f2);
			if(this.f2.health < 0)
				this.f2.health = 0;
			if(isWin()) {
				System.out.println("Kazanan: " + this.f1.name);
				break;
			}
		this.f1.health = this.f2.hit(f1);
		if(this.f1.health < 0)
			this.f2.health = 0;
		if(isWin()) {
			System.out.println("Kazanan: "+ this.f2.name);
			break;
		}
		}
	}
}
	else
		System.out.println("Sporcularin sikletleri uymuyor.");
}

boolean isWin() {
	if(this.f1.health == 0) {
		return true;
	}
	if(this.f2.health == 0) {
		return true;
	}
	return false;
}

boolean whoStart() {
	int fightNumber = (int) (Math.random() * 100);
    return (fightNumber > 50) ? true : false;
}

boolean isCheck() {
	return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight ) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
}
	
public void printScore() {
    System.out.println("------------");
    System.out.println(f1.name + " Kalan Can \t:" + f1.health);
    System.out.println(f2.name + " Kalan Can \t:" + f2.health);
}

}
