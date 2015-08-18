import java .util.Scanner;
public class Javatest42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human AR = new Human("A");
		Human OS = new Human("O");
		Human UM = new Human("U"); 
		AR . setHeight(169);
		OS . setWeight(86);
		System.out.println("計算A之 結果為"+AR . compute(169,57,"/"));
		
		System.out.println("O的體重為"+OS . getWeight());
		System.out.println("U的身高為"+UM . getHeight());
	}
}	
		class Human{
		private float height;
		private float weight;
		private String name;
		private String skinColor;
		private String id;
		
		public Human(String id1, String name1){
	    String  name = name1;
        String  id = id1;
		}
        
        public void setHeight(String id1,String name1){
        float height = h;
        }
        public float getHeight(){
        return height;
        }
        public void setWeight(float w){
        float weight = w;
        }
        public float getWeight(){
        return weight;
        }
        public float compute(float v1,float v2,char op){
        float result = 0.0f;
        switch(op){
        case'+':
        result = v1 +v2;
        break;
        case'-':
        result = v1 -v2;
        break;
        case'*':
        result = v1 *v2;
        break;
        case'/':
        result = v1 /v2;
        break;
        }
        return result;
        }
		}
        