package de.mobile.siteops

class NetscalerAppliance {

    Integer dataCenter
    String protocol
	String ipAddress
	String username
	String password
	String role
    Boolean managed = true
    static hasMany = [ lbvservers: NetscalerLbvserver ]

    Date dateCreated
    Date lastUpdated

    String toString() {
        "${dataCenter} : ${ipAddress}"
    }

    static constraints = {
    	role(inList: ['ACTIVE', 'PASSIVE'] )
    }

}
