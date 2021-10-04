package human;

public class main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hombre h = new hombre();
		ninio nh = new ninio();
		adolecente ah = new adolecente();
		
		mujer m = new mujer();
		ninia nm = new ninia();
		adolescenteM am = new adolescenteM();
		adulta oldM = new adulta();
		
		
		//man
		h.man();
		nh.boy();
		ah.young();
		
		//woman
		m.woman();
		nm.girl();
		am.youngGirl();
		oldM.oldWoman();
	}

}
