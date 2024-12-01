// new featured - sealed - it prevents other class to extends
// sealed class AJavaSeventeenNewFeatures {
// but you can permit specific class with below code
sealed class AJavaSeventeenNewFeatures permits BJavaSeventeenNewFeatures, CJavaSeventeenNewFeatures{


}

// now you have to final or non-sealed BJavaSeventeenNewFeatures because it's extending to a sealed class
// it's non-sealed so DJavaSeventeenNewFeatures can be extended to BJavaSeventeenNewFeatures
non-sealed class BJavaSeventeenNewFeatures extends AJavaSeventeenNewFeatures {
    
}

// now you have to final CJavaSeventeenNewFeatures because it's extending to a sealed class

final class CJavaSeventeenNewFeatures extends AJavaSeventeenNewFeatures{
    
}

// this will not work since AJavaSeventeenNewFeatures is sealed and it only permits AJavaSeventeenNewFeatures and BJavaSeventeenNewFeatures
// class DJavaSeventeenNewFeatures extends AJavaSeventeenNewFeatures {
    
// }

//this will not work because CJavaSeventeenNewFeatures is final
// class DJavaSeventeenNewFeatures extends CJavaSeventeenNewFeatures {
    
// }

// this will work because BJavaSeventeenNewFeatures is non-sealed
class DJavaSeventeenNewFeatures extends BJavaSeventeenNewFeatures {
    
}

// interface cannot be final so you cannot extend an interface to an interface that is sealed 
// unless the class extending (YInterface) to is also sealed 

// this will error since preview of this jdk feature is not enabled
// once enabled it should do.
// sealed interface XInterface permits YInterface { } 
// sealed interface YInterface extends XInterface { }



public class JavaSeventeenNewFeatures {
    public static void main(String a[]) {

    }
}