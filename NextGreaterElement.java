import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int array[] = {4,8,6,2,7,9};
        int n = array.length;

        nextGreaterElement(array,n);
    }
    static void nextGreaterElement(int array[], int n){
        int i =0;
        Stack<Integer> st = new Stack<>();
        int top = -1;

        int element, next;
        st.push(array[0]);
        //Now Loop for rest of element.
        for (i=1;i<n;i++){
            next = array[i];
            if (st.isEmpty()== false){
                element = st.pop();
                while (element < next){
                    System.out.println(element+" "+next);
                    if (st.isEmpty() == true)
                        break;
                    element = st.pop();
                }
                if (element>next)
                    st.push(element);
            }
            st.push(next);
        }
        while (st.isEmpty()==false){
            element=st.pop();
            next=-1;
            System.out.println(element+" "+-1);
        }
    }
}
