package id.co.hkbp.presentation

class NativeLib {

    /**
     * A native method that is implemented by the 'presentation' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'presentation' library on application startup.
        init {
            System.loadLibrary("presentation")
        }
    }
}