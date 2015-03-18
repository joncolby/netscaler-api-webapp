package de.mobile.siteops

class NetscalerService {

	String name
	String ipAddress
	Integer port
	String state
    String serviceType
    Integer dataCenter

    Date dateCreated
    Date lastUpdated

    static belongsTo = [ lbvserver: NetscalerLbvserver ]
    static hasMany = [ lbvserver: NetscalerLbvserver ]

    static constraints = {
    }

    String toString() {
        "${name} : ${ipAddress} (${state})"
    }
}
