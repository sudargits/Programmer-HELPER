//
//  SharePreference.swift
//  BerryKitchen
//
//  Created by GITS on 5/11/16.
//  Copyright © 2016 GITS. All rights reserved.
//

import Foundation

class PrefConstant {
    static let KEY_TOKEN = "token"
}
class Pref {
    
    static let instance = Pref()
    let pref = NSUserDefaults.standardUserDefaults()
    
    init(){
    
    }
    
    func saveObject(key:String ,value:AnyObject){
        pref.setObject(value, forKey: key)
        commit()
    }
    
    func getToken()->String{
        if let token = pref.objectForKey(PrefConstant.KEY_TOKEN) {
            return token as! String
        }
        return ""
    }
    
    func getBoolean(key:String)->Bool{
        return pref.boolForKey(key);
    }
    
    func getObject(key:String)->AnyObject{
         return pref.objectForKey(key)!
    }
    func getUserModel()->BKMUserData{
        let dt:BKMUserDataBase = BKMUserDataBase(object: pref.objectForKey("user_data")!)
        return (dt.content?.userData)!
    }
    
    func isEmpty(key:String)->Bool{
        if(pref.objectForKey(key) != nil) {
            return true
        }
        return false
    }
    func commit(){
        pref.synchronize()
    }
}