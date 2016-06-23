extension UIViewController {
    func showNetworkIndicator(){
        UIApplication.sharedApplication().networkActivityIndicatorVisible = true
    }
    func stopNetworkIndicator(){
        UIApplication.sharedApplication().networkActivityIndicatorVisible = false
    }
}