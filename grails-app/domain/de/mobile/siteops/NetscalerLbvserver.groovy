package de.mobile.siteops

class NetscalerLbvserver {

    String name
	Integer dataCenter
	String ipAddress
	Integer port
	String state
    String serviceType

    Date dateCreated
    Date lastUpdated

	static hasMany = [ services: NetscalerService ]
	static belongsTo = [ netscaler: NetscalerAppliance ]

    String toString() {
        "${name} : ${dataCenter} : ${state}"
    }

    static constraints = {
        name(unique: ['ipAddress','dataCenter'])
    }
}
