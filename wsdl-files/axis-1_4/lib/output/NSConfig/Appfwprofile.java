/**
 * Appfwprofile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appfwprofile  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String type;

    private java.lang.String defaults;

    private java.lang.String usehtmlerrorobject;

    private java.lang.String errorurl;

    private java.lang.String htmlerrorobject;

    private java.lang.String logeverypolicyhit;

    private java.lang.String stripcomments;

    private java.lang.String striphtmlcomments;

    private java.lang.String stripxmlcomments;

    private java.lang.String defaultcharset;

    private org.apache.axis.types.UnsignedInt postbodylimit;

    private org.apache.axis.types.UnsignedInt fileuploadmaxnum;

    private java.lang.String canonicalizehtmlresponse;

    private java.lang.String enableformtagging;

    private java.lang.String sessionlessfieldconsistency;

    private java.lang.String sessionlessurlclosure;

    private java.lang.String semicolonfieldseparator;

    private java.lang.String excludefileuploadfromchecks;

    private java.lang.String sqlinjectionparsecomments;

    private java.lang.String checkrequestheaders;

    private java.lang.String comment;

    private java.lang.String starturlaction;

    private java.lang.String[] starturl;

    private java.lang.String starturlclosure;

    private java.lang.String denyurlaction;

    private java.lang.String[] denyurl;

    private java.lang.String refererheadercheck;

    private java.lang.String csrftagaction;

    private java.lang.String csrftag;

    private java.lang.String[] csrfformactionurl;

    private java.lang.String crosssitescriptingaction;

    private java.lang.String crosssitescriptingtransformunsafehtml;

    private java.lang.String crosssitescriptingcheckcompleteurls;

    private java.lang.String[] crosssitescripting;

    private java.lang.String[] isregex;

    private java.lang.String[] formactionurl;

    private java.lang.String exemptclosureurlsfromsecuritychecks;

    private java.lang.String[] location;

    private java.lang.String sqlinjectionaction;

    private java.lang.String sqlinjectiontransformspecialchars;

    private java.lang.String sqlinjectiononlycheckfieldswithsqlchars;

    private java.lang.String sqlinjectionchecksqlwildchars;

    private java.lang.String[] sqlinjection;

    private java.lang.String[] isregex2;

    private java.lang.String[] formactionurl2;

    private java.lang.String invalidpercenthandling;

    private java.lang.String[] location2;

    private java.lang.String fieldconsistencyaction;

    private java.lang.String[] fieldconsistency;

    private java.lang.String[] isregex3;

    private java.lang.String[] formactionurl3;

    private java.lang.String cookieconsistencyaction;

    private java.lang.String[] cookieconsistency;

    private java.lang.String[] isregex4;

    private java.lang.String cookietransforms;

    private java.lang.String cookieencryption;

    private java.lang.String cookieproxying;

    private java.lang.String addcookieflags;

    private java.lang.String bufferoverflowaction;

    private org.apache.axis.types.UnsignedInt bufferoverflowmaxurllength;

    private org.apache.axis.types.UnsignedInt bufferoverflowmaxheaderlength;

    private org.apache.axis.types.UnsignedInt bufferoverflowmaxcookielength;

    private java.lang.String fieldformataction;

    private java.lang.String defaultfieldformattype;

    private org.apache.axis.types.UnsignedInt defaultfieldformatminlength;

    private org.apache.axis.types.UnsignedInt defaultfieldformatmaxlength;

    private java.lang.String[] fieldformat;

    private java.lang.String[] isregex5;

    private java.lang.String[] formactionurl4;

    private java.lang.String[] fieldtype;

    private org.apache.axis.types.UnsignedInt[] fieldformatminlength;

    private org.apache.axis.types.UnsignedInt[] fieldformatmaxlength;

    private java.lang.String creditcardaction;

    private java.lang.String creditcard;

    private org.apache.axis.types.UnsignedInt creditcardmaxallowed;

    private java.lang.String creditcardxout;

    private java.lang.String[] safeobject;

    private java.lang.String[] expression;

    private org.apache.axis.types.UnsignedInt[] maxmatchlength;

    private java.lang.String[] actioN;

    private java.lang.String requestcontenttype;

    private java.lang.String responsecontenttype;

    private java.lang.String xmlerrorobject;

    private java.lang.String signatures;

    private java.lang.String _xmlformataction;

    private java.lang.String _xmldosaction;

    private java.lang.String _xmlsqlinjectionaction;

    private java.lang.String xmlsqlinjectiononlycheckfieldswithsqlchars;

    private java.lang.String xmlsqlinjectionchecksqlwildchars;

    private java.lang.String xmlsqlinjectionparsecomments;

    private java.lang.String _xmlxssaction;

    private java.lang.String _xmlwsiaction;

    private java.lang.String _xmlattachmentaction;

    private java.lang.String _xmlvalidationaction;

    private java.lang.String xmlsoapfaultaction;

    private java.lang.String[] xmldosurl;

    private java.lang.String[] xmlwsiurl;

    private java.lang.String[] xmlvalidationurl;

    private java.lang.String[] xmlattachmenturl;

    private java.lang.String[] xmlsqlinjection;

    private java.lang.String[] isregex6;

    private java.lang.String[] location3;

    private java.lang.String[] xmlxss;

    private java.lang.String[] isregex7;

    private java.lang.String[] location4;

    private java.lang.String state;

    private java.lang.String[] xmlmaxelementdepthcheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxelementdepth;

    private java.lang.String[] xmlmaxelementnamelengthcheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxelementnamelength;

    private java.lang.String[] xmlmaxelementscheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxelements;

    private java.lang.String[] xmlmaxelementchildrencheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxelementchildren;

    private java.lang.String[] xmlmaxnodescheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxnodes;

    private java.lang.String[] xmlmaxattributescheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxattributes;

    private java.lang.String[] xmlmaxattributenamelengthcheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxattributenamelength;

    private java.lang.String[] xmlmaxattributevaluelengthcheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxattributevaluelength;

    private java.lang.String[] xmlmaxchardatalengthcheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxchardatalength;

    private java.lang.String[] xmlmaxfilesizecheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxfilesize;

    private java.lang.String[] xmlminfilesizecheck;

    private org.apache.axis.types.UnsignedInt[] xmlminfilesize;

    private java.lang.String[] xmlblockpi;

    private java.lang.String[] xmlblockdtd;

    private java.lang.String[] xmlblockexternalentities;

    private java.lang.String[] xmlmaxentityexpansionscheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxentityexpansions;

    private java.lang.String[] xmlmaxentityexpansiondepthcheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxentityexpansiondepth;

    private java.lang.String[] xmlmaxnamespacescheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxnamespaces;

    private java.lang.String[] xmlmaxnamespaceurilengthcheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxnamespaceurilength;

    private java.lang.String[] xmlsoaparraycheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxsoaparraysize;

    private org.apache.axis.types.UnsignedInt[] xmlmaxsoaparrayrank;

    private java.lang.String[] xmlwsichecks;

    private java.lang.String[] xmlrequestschema;

    private java.lang.String[] xmlresponseschema;

    private java.lang.String[] xmlwsdl;

    private java.lang.String[] xmladditionalsoapheaders;

    private java.lang.String[] xmlendpointcheck;

    private java.lang.String[] xmlvalidatesoapenvelope;

    private java.lang.String[] xmlvalidateresponse;

    private java.lang.String[] xmlmaxattachmentsizecheck;

    private org.apache.axis.types.UnsignedInt[] xmlmaxattachmentsize;

    private java.lang.String[] xmlattachmentcontenttypecheck;

    private java.lang.String[] xmlattachmentcontenttype;

    private boolean builtin;

    private java.lang.String[] trustedlearningclients;

    private java.lang.String[] contenttype;

    private java.lang.String[] excluderescontenttype;

    private java.lang.String[] starturlstate;

    private java.lang.String[] starturlcomment;

    private java.lang.String[] denyurlstate;

    private java.lang.String[] denyurlcomment;

    private java.lang.String[] fieldconsistencystate;

    private java.lang.String[] fieldconsistencycomment;

    private java.lang.String[] cookieconsistencystate;

    private java.lang.String[] cookieconsistencycomment;

    private java.lang.String[] csrfformoriginurl;

    private java.lang.String[] csrftagstate;

    private java.lang.String[] csrftagcomment;

    private java.lang.String[] crosssitescriptingstate;

    private java.lang.String[] crosssitescriptingcomment;

    private java.lang.String[] sqlinjectionstate;

    private java.lang.String[] sqlinjectioncomment;

    private java.lang.String[] fieldformatstate;

    private java.lang.String[] fieldformatcomment;

    private java.lang.String[] safeobjectstate;

    private java.lang.String[] safeobjectcomment;

    private java.lang.String[] trustedlearningstate;

    private java.lang.String[] trustedlearningcomment;

    private java.lang.String[] xmldosstate;

    private java.lang.String[] xmldoscomment;

    private java.lang.String[] xmlwsistate;

    private java.lang.String[] xmlwsicomment;

    private java.lang.String[] xmlvalidationstate;

    private java.lang.String[] xmlvalidationcomment;

    private java.lang.String[] xmlattachmentstate;

    private java.lang.String[] xmlattachmentcomment;

    private java.lang.String[] xmlsqlinjectionstate;

    private java.lang.String[] xmlsqlinjectioncomment;

    private java.lang.String[] xmlxssstate;

    private java.lang.String[] xmlxsscomment;

    private java.lang.String[] contenttypestate;

    private java.lang.String[] contenttypecomment;

    private java.lang.String[] excluderescontenttypestate;

    private java.lang.String[] excluderescontenttypestatecomment;

    public Appfwprofile() {
    }

    public Appfwprofile(
           java.lang.String name,
           java.lang.String type,
           java.lang.String defaults,
           java.lang.String usehtmlerrorobject,
           java.lang.String errorurl,
           java.lang.String htmlerrorobject,
           java.lang.String logeverypolicyhit,
           java.lang.String stripcomments,
           java.lang.String striphtmlcomments,
           java.lang.String stripxmlcomments,
           java.lang.String defaultcharset,
           org.apache.axis.types.UnsignedInt postbodylimit,
           org.apache.axis.types.UnsignedInt fileuploadmaxnum,
           java.lang.String canonicalizehtmlresponse,
           java.lang.String enableformtagging,
           java.lang.String sessionlessfieldconsistency,
           java.lang.String sessionlessurlclosure,
           java.lang.String semicolonfieldseparator,
           java.lang.String excludefileuploadfromchecks,
           java.lang.String sqlinjectionparsecomments,
           java.lang.String checkrequestheaders,
           java.lang.String comment,
           java.lang.String starturlaction,
           java.lang.String[] starturl,
           java.lang.String starturlclosure,
           java.lang.String denyurlaction,
           java.lang.String[] denyurl,
           java.lang.String refererheadercheck,
           java.lang.String csrftagaction,
           java.lang.String csrftag,
           java.lang.String[] csrfformactionurl,
           java.lang.String crosssitescriptingaction,
           java.lang.String crosssitescriptingtransformunsafehtml,
           java.lang.String crosssitescriptingcheckcompleteurls,
           java.lang.String[] crosssitescripting,
           java.lang.String[] isregex,
           java.lang.String[] formactionurl,
           java.lang.String exemptclosureurlsfromsecuritychecks,
           java.lang.String[] location,
           java.lang.String sqlinjectionaction,
           java.lang.String sqlinjectiontransformspecialchars,
           java.lang.String sqlinjectiononlycheckfieldswithsqlchars,
           java.lang.String sqlinjectionchecksqlwildchars,
           java.lang.String[] sqlinjection,
           java.lang.String[] isregex2,
           java.lang.String[] formactionurl2,
           java.lang.String invalidpercenthandling,
           java.lang.String[] location2,
           java.lang.String fieldconsistencyaction,
           java.lang.String[] fieldconsistency,
           java.lang.String[] isregex3,
           java.lang.String[] formactionurl3,
           java.lang.String cookieconsistencyaction,
           java.lang.String[] cookieconsistency,
           java.lang.String[] isregex4,
           java.lang.String cookietransforms,
           java.lang.String cookieencryption,
           java.lang.String cookieproxying,
           java.lang.String addcookieflags,
           java.lang.String bufferoverflowaction,
           org.apache.axis.types.UnsignedInt bufferoverflowmaxurllength,
           org.apache.axis.types.UnsignedInt bufferoverflowmaxheaderlength,
           org.apache.axis.types.UnsignedInt bufferoverflowmaxcookielength,
           java.lang.String fieldformataction,
           java.lang.String defaultfieldformattype,
           org.apache.axis.types.UnsignedInt defaultfieldformatminlength,
           org.apache.axis.types.UnsignedInt defaultfieldformatmaxlength,
           java.lang.String[] fieldformat,
           java.lang.String[] isregex5,
           java.lang.String[] formactionurl4,
           java.lang.String[] fieldtype,
           org.apache.axis.types.UnsignedInt[] fieldformatminlength,
           org.apache.axis.types.UnsignedInt[] fieldformatmaxlength,
           java.lang.String creditcardaction,
           java.lang.String creditcard,
           org.apache.axis.types.UnsignedInt creditcardmaxallowed,
           java.lang.String creditcardxout,
           java.lang.String[] safeobject,
           java.lang.String[] expression,
           org.apache.axis.types.UnsignedInt[] maxmatchlength,
           java.lang.String[] actioN,
           java.lang.String requestcontenttype,
           java.lang.String responsecontenttype,
           java.lang.String xmlerrorobject,
           java.lang.String signatures,
           java.lang.String _xmlformataction,
           java.lang.String _xmldosaction,
           java.lang.String _xmlsqlinjectionaction,
           java.lang.String xmlsqlinjectiononlycheckfieldswithsqlchars,
           java.lang.String xmlsqlinjectionchecksqlwildchars,
           java.lang.String xmlsqlinjectionparsecomments,
           java.lang.String _xmlxssaction,
           java.lang.String _xmlwsiaction,
           java.lang.String _xmlattachmentaction,
           java.lang.String _xmlvalidationaction,
           java.lang.String xmlsoapfaultaction,
           java.lang.String[] xmldosurl,
           java.lang.String[] xmlwsiurl,
           java.lang.String[] xmlvalidationurl,
           java.lang.String[] xmlattachmenturl,
           java.lang.String[] xmlsqlinjection,
           java.lang.String[] isregex6,
           java.lang.String[] location3,
           java.lang.String[] xmlxss,
           java.lang.String[] isregex7,
           java.lang.String[] location4,
           java.lang.String state,
           java.lang.String[] xmlmaxelementdepthcheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxelementdepth,
           java.lang.String[] xmlmaxelementnamelengthcheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxelementnamelength,
           java.lang.String[] xmlmaxelementscheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxelements,
           java.lang.String[] xmlmaxelementchildrencheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxelementchildren,
           java.lang.String[] xmlmaxnodescheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxnodes,
           java.lang.String[] xmlmaxattributescheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxattributes,
           java.lang.String[] xmlmaxattributenamelengthcheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxattributenamelength,
           java.lang.String[] xmlmaxattributevaluelengthcheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxattributevaluelength,
           java.lang.String[] xmlmaxchardatalengthcheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxchardatalength,
           java.lang.String[] xmlmaxfilesizecheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxfilesize,
           java.lang.String[] xmlminfilesizecheck,
           org.apache.axis.types.UnsignedInt[] xmlminfilesize,
           java.lang.String[] xmlblockpi,
           java.lang.String[] xmlblockdtd,
           java.lang.String[] xmlblockexternalentities,
           java.lang.String[] xmlmaxentityexpansionscheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxentityexpansions,
           java.lang.String[] xmlmaxentityexpansiondepthcheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxentityexpansiondepth,
           java.lang.String[] xmlmaxnamespacescheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxnamespaces,
           java.lang.String[] xmlmaxnamespaceurilengthcheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxnamespaceurilength,
           java.lang.String[] xmlsoaparraycheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxsoaparraysize,
           org.apache.axis.types.UnsignedInt[] xmlmaxsoaparrayrank,
           java.lang.String[] xmlwsichecks,
           java.lang.String[] xmlrequestschema,
           java.lang.String[] xmlresponseschema,
           java.lang.String[] xmlwsdl,
           java.lang.String[] xmladditionalsoapheaders,
           java.lang.String[] xmlendpointcheck,
           java.lang.String[] xmlvalidatesoapenvelope,
           java.lang.String[] xmlvalidateresponse,
           java.lang.String[] xmlmaxattachmentsizecheck,
           org.apache.axis.types.UnsignedInt[] xmlmaxattachmentsize,
           java.lang.String[] xmlattachmentcontenttypecheck,
           java.lang.String[] xmlattachmentcontenttype,
           boolean builtin,
           java.lang.String[] trustedlearningclients,
           java.lang.String[] contenttype,
           java.lang.String[] excluderescontenttype,
           java.lang.String[] starturlstate,
           java.lang.String[] starturlcomment,
           java.lang.String[] denyurlstate,
           java.lang.String[] denyurlcomment,
           java.lang.String[] fieldconsistencystate,
           java.lang.String[] fieldconsistencycomment,
           java.lang.String[] cookieconsistencystate,
           java.lang.String[] cookieconsistencycomment,
           java.lang.String[] csrfformoriginurl,
           java.lang.String[] csrftagstate,
           java.lang.String[] csrftagcomment,
           java.lang.String[] crosssitescriptingstate,
           java.lang.String[] crosssitescriptingcomment,
           java.lang.String[] sqlinjectionstate,
           java.lang.String[] sqlinjectioncomment,
           java.lang.String[] fieldformatstate,
           java.lang.String[] fieldformatcomment,
           java.lang.String[] safeobjectstate,
           java.lang.String[] safeobjectcomment,
           java.lang.String[] trustedlearningstate,
           java.lang.String[] trustedlearningcomment,
           java.lang.String[] xmldosstate,
           java.lang.String[] xmldoscomment,
           java.lang.String[] xmlwsistate,
           java.lang.String[] xmlwsicomment,
           java.lang.String[] xmlvalidationstate,
           java.lang.String[] xmlvalidationcomment,
           java.lang.String[] xmlattachmentstate,
           java.lang.String[] xmlattachmentcomment,
           java.lang.String[] xmlsqlinjectionstate,
           java.lang.String[] xmlsqlinjectioncomment,
           java.lang.String[] xmlxssstate,
           java.lang.String[] xmlxsscomment,
           java.lang.String[] contenttypestate,
           java.lang.String[] contenttypecomment,
           java.lang.String[] excluderescontenttypestate,
           java.lang.String[] excluderescontenttypestatecomment) {
           this.name = name;
           this.type = type;
           this.defaults = defaults;
           this.usehtmlerrorobject = usehtmlerrorobject;
           this.errorurl = errorurl;
           this.htmlerrorobject = htmlerrorobject;
           this.logeverypolicyhit = logeverypolicyhit;
           this.stripcomments = stripcomments;
           this.striphtmlcomments = striphtmlcomments;
           this.stripxmlcomments = stripxmlcomments;
           this.defaultcharset = defaultcharset;
           this.postbodylimit = postbodylimit;
           this.fileuploadmaxnum = fileuploadmaxnum;
           this.canonicalizehtmlresponse = canonicalizehtmlresponse;
           this.enableformtagging = enableformtagging;
           this.sessionlessfieldconsistency = sessionlessfieldconsistency;
           this.sessionlessurlclosure = sessionlessurlclosure;
           this.semicolonfieldseparator = semicolonfieldseparator;
           this.excludefileuploadfromchecks = excludefileuploadfromchecks;
           this.sqlinjectionparsecomments = sqlinjectionparsecomments;
           this.checkrequestheaders = checkrequestheaders;
           this.comment = comment;
           this.starturlaction = starturlaction;
           this.starturl = starturl;
           this.starturlclosure = starturlclosure;
           this.denyurlaction = denyurlaction;
           this.denyurl = denyurl;
           this.refererheadercheck = refererheadercheck;
           this.csrftagaction = csrftagaction;
           this.csrftag = csrftag;
           this.csrfformactionurl = csrfformactionurl;
           this.crosssitescriptingaction = crosssitescriptingaction;
           this.crosssitescriptingtransformunsafehtml = crosssitescriptingtransformunsafehtml;
           this.crosssitescriptingcheckcompleteurls = crosssitescriptingcheckcompleteurls;
           this.crosssitescripting = crosssitescripting;
           this.isregex = isregex;
           this.formactionurl = formactionurl;
           this.exemptclosureurlsfromsecuritychecks = exemptclosureurlsfromsecuritychecks;
           this.location = location;
           this.sqlinjectionaction = sqlinjectionaction;
           this.sqlinjectiontransformspecialchars = sqlinjectiontransformspecialchars;
           this.sqlinjectiononlycheckfieldswithsqlchars = sqlinjectiononlycheckfieldswithsqlchars;
           this.sqlinjectionchecksqlwildchars = sqlinjectionchecksqlwildchars;
           this.sqlinjection = sqlinjection;
           this.isregex2 = isregex2;
           this.formactionurl2 = formactionurl2;
           this.invalidpercenthandling = invalidpercenthandling;
           this.location2 = location2;
           this.fieldconsistencyaction = fieldconsistencyaction;
           this.fieldconsistency = fieldconsistency;
           this.isregex3 = isregex3;
           this.formactionurl3 = formactionurl3;
           this.cookieconsistencyaction = cookieconsistencyaction;
           this.cookieconsistency = cookieconsistency;
           this.isregex4 = isregex4;
           this.cookietransforms = cookietransforms;
           this.cookieencryption = cookieencryption;
           this.cookieproxying = cookieproxying;
           this.addcookieflags = addcookieflags;
           this.bufferoverflowaction = bufferoverflowaction;
           this.bufferoverflowmaxurllength = bufferoverflowmaxurllength;
           this.bufferoverflowmaxheaderlength = bufferoverflowmaxheaderlength;
           this.bufferoverflowmaxcookielength = bufferoverflowmaxcookielength;
           this.fieldformataction = fieldformataction;
           this.defaultfieldformattype = defaultfieldformattype;
           this.defaultfieldformatminlength = defaultfieldformatminlength;
           this.defaultfieldformatmaxlength = defaultfieldformatmaxlength;
           this.fieldformat = fieldformat;
           this.isregex5 = isregex5;
           this.formactionurl4 = formactionurl4;
           this.fieldtype = fieldtype;
           this.fieldformatminlength = fieldformatminlength;
           this.fieldformatmaxlength = fieldformatmaxlength;
           this.creditcardaction = creditcardaction;
           this.creditcard = creditcard;
           this.creditcardmaxallowed = creditcardmaxallowed;
           this.creditcardxout = creditcardxout;
           this.safeobject = safeobject;
           this.expression = expression;
           this.maxmatchlength = maxmatchlength;
           this.actioN = actioN;
           this.requestcontenttype = requestcontenttype;
           this.responsecontenttype = responsecontenttype;
           this.xmlerrorobject = xmlerrorobject;
           this.signatures = signatures;
           this._xmlformataction = _xmlformataction;
           this._xmldosaction = _xmldosaction;
           this._xmlsqlinjectionaction = _xmlsqlinjectionaction;
           this.xmlsqlinjectiononlycheckfieldswithsqlchars = xmlsqlinjectiononlycheckfieldswithsqlchars;
           this.xmlsqlinjectionchecksqlwildchars = xmlsqlinjectionchecksqlwildchars;
           this.xmlsqlinjectionparsecomments = xmlsqlinjectionparsecomments;
           this._xmlxssaction = _xmlxssaction;
           this._xmlwsiaction = _xmlwsiaction;
           this._xmlattachmentaction = _xmlattachmentaction;
           this._xmlvalidationaction = _xmlvalidationaction;
           this.xmlsoapfaultaction = xmlsoapfaultaction;
           this.xmldosurl = xmldosurl;
           this.xmlwsiurl = xmlwsiurl;
           this.xmlvalidationurl = xmlvalidationurl;
           this.xmlattachmenturl = xmlattachmenturl;
           this.xmlsqlinjection = xmlsqlinjection;
           this.isregex6 = isregex6;
           this.location3 = location3;
           this.xmlxss = xmlxss;
           this.isregex7 = isregex7;
           this.location4 = location4;
           this.state = state;
           this.xmlmaxelementdepthcheck = xmlmaxelementdepthcheck;
           this.xmlmaxelementdepth = xmlmaxelementdepth;
           this.xmlmaxelementnamelengthcheck = xmlmaxelementnamelengthcheck;
           this.xmlmaxelementnamelength = xmlmaxelementnamelength;
           this.xmlmaxelementscheck = xmlmaxelementscheck;
           this.xmlmaxelements = xmlmaxelements;
           this.xmlmaxelementchildrencheck = xmlmaxelementchildrencheck;
           this.xmlmaxelementchildren = xmlmaxelementchildren;
           this.xmlmaxnodescheck = xmlmaxnodescheck;
           this.xmlmaxnodes = xmlmaxnodes;
           this.xmlmaxattributescheck = xmlmaxattributescheck;
           this.xmlmaxattributes = xmlmaxattributes;
           this.xmlmaxattributenamelengthcheck = xmlmaxattributenamelengthcheck;
           this.xmlmaxattributenamelength = xmlmaxattributenamelength;
           this.xmlmaxattributevaluelengthcheck = xmlmaxattributevaluelengthcheck;
           this.xmlmaxattributevaluelength = xmlmaxattributevaluelength;
           this.xmlmaxchardatalengthcheck = xmlmaxchardatalengthcheck;
           this.xmlmaxchardatalength = xmlmaxchardatalength;
           this.xmlmaxfilesizecheck = xmlmaxfilesizecheck;
           this.xmlmaxfilesize = xmlmaxfilesize;
           this.xmlminfilesizecheck = xmlminfilesizecheck;
           this.xmlminfilesize = xmlminfilesize;
           this.xmlblockpi = xmlblockpi;
           this.xmlblockdtd = xmlblockdtd;
           this.xmlblockexternalentities = xmlblockexternalentities;
           this.xmlmaxentityexpansionscheck = xmlmaxentityexpansionscheck;
           this.xmlmaxentityexpansions = xmlmaxentityexpansions;
           this.xmlmaxentityexpansiondepthcheck = xmlmaxentityexpansiondepthcheck;
           this.xmlmaxentityexpansiondepth = xmlmaxentityexpansiondepth;
           this.xmlmaxnamespacescheck = xmlmaxnamespacescheck;
           this.xmlmaxnamespaces = xmlmaxnamespaces;
           this.xmlmaxnamespaceurilengthcheck = xmlmaxnamespaceurilengthcheck;
           this.xmlmaxnamespaceurilength = xmlmaxnamespaceurilength;
           this.xmlsoaparraycheck = xmlsoaparraycheck;
           this.xmlmaxsoaparraysize = xmlmaxsoaparraysize;
           this.xmlmaxsoaparrayrank = xmlmaxsoaparrayrank;
           this.xmlwsichecks = xmlwsichecks;
           this.xmlrequestschema = xmlrequestschema;
           this.xmlresponseschema = xmlresponseschema;
           this.xmlwsdl = xmlwsdl;
           this.xmladditionalsoapheaders = xmladditionalsoapheaders;
           this.xmlendpointcheck = xmlendpointcheck;
           this.xmlvalidatesoapenvelope = xmlvalidatesoapenvelope;
           this.xmlvalidateresponse = xmlvalidateresponse;
           this.xmlmaxattachmentsizecheck = xmlmaxattachmentsizecheck;
           this.xmlmaxattachmentsize = xmlmaxattachmentsize;
           this.xmlattachmentcontenttypecheck = xmlattachmentcontenttypecheck;
           this.xmlattachmentcontenttype = xmlattachmentcontenttype;
           this.builtin = builtin;
           this.trustedlearningclients = trustedlearningclients;
           this.contenttype = contenttype;
           this.excluderescontenttype = excluderescontenttype;
           this.starturlstate = starturlstate;
           this.starturlcomment = starturlcomment;
           this.denyurlstate = denyurlstate;
           this.denyurlcomment = denyurlcomment;
           this.fieldconsistencystate = fieldconsistencystate;
           this.fieldconsistencycomment = fieldconsistencycomment;
           this.cookieconsistencystate = cookieconsistencystate;
           this.cookieconsistencycomment = cookieconsistencycomment;
           this.csrfformoriginurl = csrfformoriginurl;
           this.csrftagstate = csrftagstate;
           this.csrftagcomment = csrftagcomment;
           this.crosssitescriptingstate = crosssitescriptingstate;
           this.crosssitescriptingcomment = crosssitescriptingcomment;
           this.sqlinjectionstate = sqlinjectionstate;
           this.sqlinjectioncomment = sqlinjectioncomment;
           this.fieldformatstate = fieldformatstate;
           this.fieldformatcomment = fieldformatcomment;
           this.safeobjectstate = safeobjectstate;
           this.safeobjectcomment = safeobjectcomment;
           this.trustedlearningstate = trustedlearningstate;
           this.trustedlearningcomment = trustedlearningcomment;
           this.xmldosstate = xmldosstate;
           this.xmldoscomment = xmldoscomment;
           this.xmlwsistate = xmlwsistate;
           this.xmlwsicomment = xmlwsicomment;
           this.xmlvalidationstate = xmlvalidationstate;
           this.xmlvalidationcomment = xmlvalidationcomment;
           this.xmlattachmentstate = xmlattachmentstate;
           this.xmlattachmentcomment = xmlattachmentcomment;
           this.xmlsqlinjectionstate = xmlsqlinjectionstate;
           this.xmlsqlinjectioncomment = xmlsqlinjectioncomment;
           this.xmlxssstate = xmlxssstate;
           this.xmlxsscomment = xmlxsscomment;
           this.contenttypestate = contenttypestate;
           this.contenttypecomment = contenttypecomment;
           this.excluderescontenttypestate = excluderescontenttypestate;
           this.excluderescontenttypestatecomment = excluderescontenttypestatecomment;
    }


    /**
     * Gets the name value for this Appfwprofile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Appfwprofile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this Appfwprofile.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Appfwprofile.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the defaults value for this Appfwprofile.
     * 
     * @return defaults
     */
    public java.lang.String getDefaults() {
        return defaults;
    }


    /**
     * Sets the defaults value for this Appfwprofile.
     * 
     * @param defaults
     */
    public void setDefaults(java.lang.String defaults) {
        this.defaults = defaults;
    }


    /**
     * Gets the usehtmlerrorobject value for this Appfwprofile.
     * 
     * @return usehtmlerrorobject
     */
    public java.lang.String getUsehtmlerrorobject() {
        return usehtmlerrorobject;
    }


    /**
     * Sets the usehtmlerrorobject value for this Appfwprofile.
     * 
     * @param usehtmlerrorobject
     */
    public void setUsehtmlerrorobject(java.lang.String usehtmlerrorobject) {
        this.usehtmlerrorobject = usehtmlerrorobject;
    }


    /**
     * Gets the errorurl value for this Appfwprofile.
     * 
     * @return errorurl
     */
    public java.lang.String getErrorurl() {
        return errorurl;
    }


    /**
     * Sets the errorurl value for this Appfwprofile.
     * 
     * @param errorurl
     */
    public void setErrorurl(java.lang.String errorurl) {
        this.errorurl = errorurl;
    }


    /**
     * Gets the htmlerrorobject value for this Appfwprofile.
     * 
     * @return htmlerrorobject
     */
    public java.lang.String getHtmlerrorobject() {
        return htmlerrorobject;
    }


    /**
     * Sets the htmlerrorobject value for this Appfwprofile.
     * 
     * @param htmlerrorobject
     */
    public void setHtmlerrorobject(java.lang.String htmlerrorobject) {
        this.htmlerrorobject = htmlerrorobject;
    }


    /**
     * Gets the logeverypolicyhit value for this Appfwprofile.
     * 
     * @return logeverypolicyhit
     */
    public java.lang.String getLogeverypolicyhit() {
        return logeverypolicyhit;
    }


    /**
     * Sets the logeverypolicyhit value for this Appfwprofile.
     * 
     * @param logeverypolicyhit
     */
    public void setLogeverypolicyhit(java.lang.String logeverypolicyhit) {
        this.logeverypolicyhit = logeverypolicyhit;
    }


    /**
     * Gets the stripcomments value for this Appfwprofile.
     * 
     * @return stripcomments
     */
    public java.lang.String getStripcomments() {
        return stripcomments;
    }


    /**
     * Sets the stripcomments value for this Appfwprofile.
     * 
     * @param stripcomments
     */
    public void setStripcomments(java.lang.String stripcomments) {
        this.stripcomments = stripcomments;
    }


    /**
     * Gets the striphtmlcomments value for this Appfwprofile.
     * 
     * @return striphtmlcomments
     */
    public java.lang.String getStriphtmlcomments() {
        return striphtmlcomments;
    }


    /**
     * Sets the striphtmlcomments value for this Appfwprofile.
     * 
     * @param striphtmlcomments
     */
    public void setStriphtmlcomments(java.lang.String striphtmlcomments) {
        this.striphtmlcomments = striphtmlcomments;
    }


    /**
     * Gets the stripxmlcomments value for this Appfwprofile.
     * 
     * @return stripxmlcomments
     */
    public java.lang.String getStripxmlcomments() {
        return stripxmlcomments;
    }


    /**
     * Sets the stripxmlcomments value for this Appfwprofile.
     * 
     * @param stripxmlcomments
     */
    public void setStripxmlcomments(java.lang.String stripxmlcomments) {
        this.stripxmlcomments = stripxmlcomments;
    }


    /**
     * Gets the defaultcharset value for this Appfwprofile.
     * 
     * @return defaultcharset
     */
    public java.lang.String getDefaultcharset() {
        return defaultcharset;
    }


    /**
     * Sets the defaultcharset value for this Appfwprofile.
     * 
     * @param defaultcharset
     */
    public void setDefaultcharset(java.lang.String defaultcharset) {
        this.defaultcharset = defaultcharset;
    }


    /**
     * Gets the postbodylimit value for this Appfwprofile.
     * 
     * @return postbodylimit
     */
    public org.apache.axis.types.UnsignedInt getPostbodylimit() {
        return postbodylimit;
    }


    /**
     * Sets the postbodylimit value for this Appfwprofile.
     * 
     * @param postbodylimit
     */
    public void setPostbodylimit(org.apache.axis.types.UnsignedInt postbodylimit) {
        this.postbodylimit = postbodylimit;
    }


    /**
     * Gets the fileuploadmaxnum value for this Appfwprofile.
     * 
     * @return fileuploadmaxnum
     */
    public org.apache.axis.types.UnsignedInt getFileuploadmaxnum() {
        return fileuploadmaxnum;
    }


    /**
     * Sets the fileuploadmaxnum value for this Appfwprofile.
     * 
     * @param fileuploadmaxnum
     */
    public void setFileuploadmaxnum(org.apache.axis.types.UnsignedInt fileuploadmaxnum) {
        this.fileuploadmaxnum = fileuploadmaxnum;
    }


    /**
     * Gets the canonicalizehtmlresponse value for this Appfwprofile.
     * 
     * @return canonicalizehtmlresponse
     */
    public java.lang.String getCanonicalizehtmlresponse() {
        return canonicalizehtmlresponse;
    }


    /**
     * Sets the canonicalizehtmlresponse value for this Appfwprofile.
     * 
     * @param canonicalizehtmlresponse
     */
    public void setCanonicalizehtmlresponse(java.lang.String canonicalizehtmlresponse) {
        this.canonicalizehtmlresponse = canonicalizehtmlresponse;
    }


    /**
     * Gets the enableformtagging value for this Appfwprofile.
     * 
     * @return enableformtagging
     */
    public java.lang.String getEnableformtagging() {
        return enableformtagging;
    }


    /**
     * Sets the enableformtagging value for this Appfwprofile.
     * 
     * @param enableformtagging
     */
    public void setEnableformtagging(java.lang.String enableformtagging) {
        this.enableformtagging = enableformtagging;
    }


    /**
     * Gets the sessionlessfieldconsistency value for this Appfwprofile.
     * 
     * @return sessionlessfieldconsistency
     */
    public java.lang.String getSessionlessfieldconsistency() {
        return sessionlessfieldconsistency;
    }


    /**
     * Sets the sessionlessfieldconsistency value for this Appfwprofile.
     * 
     * @param sessionlessfieldconsistency
     */
    public void setSessionlessfieldconsistency(java.lang.String sessionlessfieldconsistency) {
        this.sessionlessfieldconsistency = sessionlessfieldconsistency;
    }


    /**
     * Gets the sessionlessurlclosure value for this Appfwprofile.
     * 
     * @return sessionlessurlclosure
     */
    public java.lang.String getSessionlessurlclosure() {
        return sessionlessurlclosure;
    }


    /**
     * Sets the sessionlessurlclosure value for this Appfwprofile.
     * 
     * @param sessionlessurlclosure
     */
    public void setSessionlessurlclosure(java.lang.String sessionlessurlclosure) {
        this.sessionlessurlclosure = sessionlessurlclosure;
    }


    /**
     * Gets the semicolonfieldseparator value for this Appfwprofile.
     * 
     * @return semicolonfieldseparator
     */
    public java.lang.String getSemicolonfieldseparator() {
        return semicolonfieldseparator;
    }


    /**
     * Sets the semicolonfieldseparator value for this Appfwprofile.
     * 
     * @param semicolonfieldseparator
     */
    public void setSemicolonfieldseparator(java.lang.String semicolonfieldseparator) {
        this.semicolonfieldseparator = semicolonfieldseparator;
    }


    /**
     * Gets the excludefileuploadfromchecks value for this Appfwprofile.
     * 
     * @return excludefileuploadfromchecks
     */
    public java.lang.String getExcludefileuploadfromchecks() {
        return excludefileuploadfromchecks;
    }


    /**
     * Sets the excludefileuploadfromchecks value for this Appfwprofile.
     * 
     * @param excludefileuploadfromchecks
     */
    public void setExcludefileuploadfromchecks(java.lang.String excludefileuploadfromchecks) {
        this.excludefileuploadfromchecks = excludefileuploadfromchecks;
    }


    /**
     * Gets the sqlinjectionparsecomments value for this Appfwprofile.
     * 
     * @return sqlinjectionparsecomments
     */
    public java.lang.String getSqlinjectionparsecomments() {
        return sqlinjectionparsecomments;
    }


    /**
     * Sets the sqlinjectionparsecomments value for this Appfwprofile.
     * 
     * @param sqlinjectionparsecomments
     */
    public void setSqlinjectionparsecomments(java.lang.String sqlinjectionparsecomments) {
        this.sqlinjectionparsecomments = sqlinjectionparsecomments;
    }


    /**
     * Gets the checkrequestheaders value for this Appfwprofile.
     * 
     * @return checkrequestheaders
     */
    public java.lang.String getCheckrequestheaders() {
        return checkrequestheaders;
    }


    /**
     * Sets the checkrequestheaders value for this Appfwprofile.
     * 
     * @param checkrequestheaders
     */
    public void setCheckrequestheaders(java.lang.String checkrequestheaders) {
        this.checkrequestheaders = checkrequestheaders;
    }


    /**
     * Gets the comment value for this Appfwprofile.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Appfwprofile.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the starturlaction value for this Appfwprofile.
     * 
     * @return starturlaction
     */
    public java.lang.String getStarturlaction() {
        return starturlaction;
    }


    /**
     * Sets the starturlaction value for this Appfwprofile.
     * 
     * @param starturlaction
     */
    public void setStarturlaction(java.lang.String starturlaction) {
        this.starturlaction = starturlaction;
    }


    /**
     * Gets the starturl value for this Appfwprofile.
     * 
     * @return starturl
     */
    public java.lang.String[] getStarturl() {
        return starturl;
    }


    /**
     * Sets the starturl value for this Appfwprofile.
     * 
     * @param starturl
     */
    public void setStarturl(java.lang.String[] starturl) {
        this.starturl = starturl;
    }


    /**
     * Gets the starturlclosure value for this Appfwprofile.
     * 
     * @return starturlclosure
     */
    public java.lang.String getStarturlclosure() {
        return starturlclosure;
    }


    /**
     * Sets the starturlclosure value for this Appfwprofile.
     * 
     * @param starturlclosure
     */
    public void setStarturlclosure(java.lang.String starturlclosure) {
        this.starturlclosure = starturlclosure;
    }


    /**
     * Gets the denyurlaction value for this Appfwprofile.
     * 
     * @return denyurlaction
     */
    public java.lang.String getDenyurlaction() {
        return denyurlaction;
    }


    /**
     * Sets the denyurlaction value for this Appfwprofile.
     * 
     * @param denyurlaction
     */
    public void setDenyurlaction(java.lang.String denyurlaction) {
        this.denyurlaction = denyurlaction;
    }


    /**
     * Gets the denyurl value for this Appfwprofile.
     * 
     * @return denyurl
     */
    public java.lang.String[] getDenyurl() {
        return denyurl;
    }


    /**
     * Sets the denyurl value for this Appfwprofile.
     * 
     * @param denyurl
     */
    public void setDenyurl(java.lang.String[] denyurl) {
        this.denyurl = denyurl;
    }


    /**
     * Gets the refererheadercheck value for this Appfwprofile.
     * 
     * @return refererheadercheck
     */
    public java.lang.String getRefererheadercheck() {
        return refererheadercheck;
    }


    /**
     * Sets the refererheadercheck value for this Appfwprofile.
     * 
     * @param refererheadercheck
     */
    public void setRefererheadercheck(java.lang.String refererheadercheck) {
        this.refererheadercheck = refererheadercheck;
    }


    /**
     * Gets the csrftagaction value for this Appfwprofile.
     * 
     * @return csrftagaction
     */
    public java.lang.String getCsrftagaction() {
        return csrftagaction;
    }


    /**
     * Sets the csrftagaction value for this Appfwprofile.
     * 
     * @param csrftagaction
     */
    public void setCsrftagaction(java.lang.String csrftagaction) {
        this.csrftagaction = csrftagaction;
    }


    /**
     * Gets the csrftag value for this Appfwprofile.
     * 
     * @return csrftag
     */
    public java.lang.String getCsrftag() {
        return csrftag;
    }


    /**
     * Sets the csrftag value for this Appfwprofile.
     * 
     * @param csrftag
     */
    public void setCsrftag(java.lang.String csrftag) {
        this.csrftag = csrftag;
    }


    /**
     * Gets the csrfformactionurl value for this Appfwprofile.
     * 
     * @return csrfformactionurl
     */
    public java.lang.String[] getCsrfformactionurl() {
        return csrfformactionurl;
    }


    /**
     * Sets the csrfformactionurl value for this Appfwprofile.
     * 
     * @param csrfformactionurl
     */
    public void setCsrfformactionurl(java.lang.String[] csrfformactionurl) {
        this.csrfformactionurl = csrfformactionurl;
    }


    /**
     * Gets the crosssitescriptingaction value for this Appfwprofile.
     * 
     * @return crosssitescriptingaction
     */
    public java.lang.String getCrosssitescriptingaction() {
        return crosssitescriptingaction;
    }


    /**
     * Sets the crosssitescriptingaction value for this Appfwprofile.
     * 
     * @param crosssitescriptingaction
     */
    public void setCrosssitescriptingaction(java.lang.String crosssitescriptingaction) {
        this.crosssitescriptingaction = crosssitescriptingaction;
    }


    /**
     * Gets the crosssitescriptingtransformunsafehtml value for this Appfwprofile.
     * 
     * @return crosssitescriptingtransformunsafehtml
     */
    public java.lang.String getCrosssitescriptingtransformunsafehtml() {
        return crosssitescriptingtransformunsafehtml;
    }


    /**
     * Sets the crosssitescriptingtransformunsafehtml value for this Appfwprofile.
     * 
     * @param crosssitescriptingtransformunsafehtml
     */
    public void setCrosssitescriptingtransformunsafehtml(java.lang.String crosssitescriptingtransformunsafehtml) {
        this.crosssitescriptingtransformunsafehtml = crosssitescriptingtransformunsafehtml;
    }


    /**
     * Gets the crosssitescriptingcheckcompleteurls value for this Appfwprofile.
     * 
     * @return crosssitescriptingcheckcompleteurls
     */
    public java.lang.String getCrosssitescriptingcheckcompleteurls() {
        return crosssitescriptingcheckcompleteurls;
    }


    /**
     * Sets the crosssitescriptingcheckcompleteurls value for this Appfwprofile.
     * 
     * @param crosssitescriptingcheckcompleteurls
     */
    public void setCrosssitescriptingcheckcompleteurls(java.lang.String crosssitescriptingcheckcompleteurls) {
        this.crosssitescriptingcheckcompleteurls = crosssitescriptingcheckcompleteurls;
    }


    /**
     * Gets the crosssitescripting value for this Appfwprofile.
     * 
     * @return crosssitescripting
     */
    public java.lang.String[] getCrosssitescripting() {
        return crosssitescripting;
    }


    /**
     * Sets the crosssitescripting value for this Appfwprofile.
     * 
     * @param crosssitescripting
     */
    public void setCrosssitescripting(java.lang.String[] crosssitescripting) {
        this.crosssitescripting = crosssitescripting;
    }


    /**
     * Gets the isregex value for this Appfwprofile.
     * 
     * @return isregex
     */
    public java.lang.String[] getIsregex() {
        return isregex;
    }


    /**
     * Sets the isregex value for this Appfwprofile.
     * 
     * @param isregex
     */
    public void setIsregex(java.lang.String[] isregex) {
        this.isregex = isregex;
    }


    /**
     * Gets the formactionurl value for this Appfwprofile.
     * 
     * @return formactionurl
     */
    public java.lang.String[] getFormactionurl() {
        return formactionurl;
    }


    /**
     * Sets the formactionurl value for this Appfwprofile.
     * 
     * @param formactionurl
     */
    public void setFormactionurl(java.lang.String[] formactionurl) {
        this.formactionurl = formactionurl;
    }


    /**
     * Gets the exemptclosureurlsfromsecuritychecks value for this Appfwprofile.
     * 
     * @return exemptclosureurlsfromsecuritychecks
     */
    public java.lang.String getExemptclosureurlsfromsecuritychecks() {
        return exemptclosureurlsfromsecuritychecks;
    }


    /**
     * Sets the exemptclosureurlsfromsecuritychecks value for this Appfwprofile.
     * 
     * @param exemptclosureurlsfromsecuritychecks
     */
    public void setExemptclosureurlsfromsecuritychecks(java.lang.String exemptclosureurlsfromsecuritychecks) {
        this.exemptclosureurlsfromsecuritychecks = exemptclosureurlsfromsecuritychecks;
    }


    /**
     * Gets the location value for this Appfwprofile.
     * 
     * @return location
     */
    public java.lang.String[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Appfwprofile.
     * 
     * @param location
     */
    public void setLocation(java.lang.String[] location) {
        this.location = location;
    }


    /**
     * Gets the sqlinjectionaction value for this Appfwprofile.
     * 
     * @return sqlinjectionaction
     */
    public java.lang.String getSqlinjectionaction() {
        return sqlinjectionaction;
    }


    /**
     * Sets the sqlinjectionaction value for this Appfwprofile.
     * 
     * @param sqlinjectionaction
     */
    public void setSqlinjectionaction(java.lang.String sqlinjectionaction) {
        this.sqlinjectionaction = sqlinjectionaction;
    }


    /**
     * Gets the sqlinjectiontransformspecialchars value for this Appfwprofile.
     * 
     * @return sqlinjectiontransformspecialchars
     */
    public java.lang.String getSqlinjectiontransformspecialchars() {
        return sqlinjectiontransformspecialchars;
    }


    /**
     * Sets the sqlinjectiontransformspecialchars value for this Appfwprofile.
     * 
     * @param sqlinjectiontransformspecialchars
     */
    public void setSqlinjectiontransformspecialchars(java.lang.String sqlinjectiontransformspecialchars) {
        this.sqlinjectiontransformspecialchars = sqlinjectiontransformspecialchars;
    }


    /**
     * Gets the sqlinjectiononlycheckfieldswithsqlchars value for this Appfwprofile.
     * 
     * @return sqlinjectiononlycheckfieldswithsqlchars
     */
    public java.lang.String getSqlinjectiononlycheckfieldswithsqlchars() {
        return sqlinjectiononlycheckfieldswithsqlchars;
    }


    /**
     * Sets the sqlinjectiononlycheckfieldswithsqlchars value for this Appfwprofile.
     * 
     * @param sqlinjectiononlycheckfieldswithsqlchars
     */
    public void setSqlinjectiononlycheckfieldswithsqlchars(java.lang.String sqlinjectiononlycheckfieldswithsqlchars) {
        this.sqlinjectiononlycheckfieldswithsqlchars = sqlinjectiononlycheckfieldswithsqlchars;
    }


    /**
     * Gets the sqlinjectionchecksqlwildchars value for this Appfwprofile.
     * 
     * @return sqlinjectionchecksqlwildchars
     */
    public java.lang.String getSqlinjectionchecksqlwildchars() {
        return sqlinjectionchecksqlwildchars;
    }


    /**
     * Sets the sqlinjectionchecksqlwildchars value for this Appfwprofile.
     * 
     * @param sqlinjectionchecksqlwildchars
     */
    public void setSqlinjectionchecksqlwildchars(java.lang.String sqlinjectionchecksqlwildchars) {
        this.sqlinjectionchecksqlwildchars = sqlinjectionchecksqlwildchars;
    }


    /**
     * Gets the sqlinjection value for this Appfwprofile.
     * 
     * @return sqlinjection
     */
    public java.lang.String[] getSqlinjection() {
        return sqlinjection;
    }


    /**
     * Sets the sqlinjection value for this Appfwprofile.
     * 
     * @param sqlinjection
     */
    public void setSqlinjection(java.lang.String[] sqlinjection) {
        this.sqlinjection = sqlinjection;
    }


    /**
     * Gets the isregex2 value for this Appfwprofile.
     * 
     * @return isregex2
     */
    public java.lang.String[] getIsregex2() {
        return isregex2;
    }


    /**
     * Sets the isregex2 value for this Appfwprofile.
     * 
     * @param isregex2
     */
    public void setIsregex2(java.lang.String[] isregex2) {
        this.isregex2 = isregex2;
    }


    /**
     * Gets the formactionurl2 value for this Appfwprofile.
     * 
     * @return formactionurl2
     */
    public java.lang.String[] getFormactionurl2() {
        return formactionurl2;
    }


    /**
     * Sets the formactionurl2 value for this Appfwprofile.
     * 
     * @param formactionurl2
     */
    public void setFormactionurl2(java.lang.String[] formactionurl2) {
        this.formactionurl2 = formactionurl2;
    }


    /**
     * Gets the invalidpercenthandling value for this Appfwprofile.
     * 
     * @return invalidpercenthandling
     */
    public java.lang.String getInvalidpercenthandling() {
        return invalidpercenthandling;
    }


    /**
     * Sets the invalidpercenthandling value for this Appfwprofile.
     * 
     * @param invalidpercenthandling
     */
    public void setInvalidpercenthandling(java.lang.String invalidpercenthandling) {
        this.invalidpercenthandling = invalidpercenthandling;
    }


    /**
     * Gets the location2 value for this Appfwprofile.
     * 
     * @return location2
     */
    public java.lang.String[] getLocation2() {
        return location2;
    }


    /**
     * Sets the location2 value for this Appfwprofile.
     * 
     * @param location2
     */
    public void setLocation2(java.lang.String[] location2) {
        this.location2 = location2;
    }


    /**
     * Gets the fieldconsistencyaction value for this Appfwprofile.
     * 
     * @return fieldconsistencyaction
     */
    public java.lang.String getFieldconsistencyaction() {
        return fieldconsistencyaction;
    }


    /**
     * Sets the fieldconsistencyaction value for this Appfwprofile.
     * 
     * @param fieldconsistencyaction
     */
    public void setFieldconsistencyaction(java.lang.String fieldconsistencyaction) {
        this.fieldconsistencyaction = fieldconsistencyaction;
    }


    /**
     * Gets the fieldconsistency value for this Appfwprofile.
     * 
     * @return fieldconsistency
     */
    public java.lang.String[] getFieldconsistency() {
        return fieldconsistency;
    }


    /**
     * Sets the fieldconsistency value for this Appfwprofile.
     * 
     * @param fieldconsistency
     */
    public void setFieldconsistency(java.lang.String[] fieldconsistency) {
        this.fieldconsistency = fieldconsistency;
    }


    /**
     * Gets the isregex3 value for this Appfwprofile.
     * 
     * @return isregex3
     */
    public java.lang.String[] getIsregex3() {
        return isregex3;
    }


    /**
     * Sets the isregex3 value for this Appfwprofile.
     * 
     * @param isregex3
     */
    public void setIsregex3(java.lang.String[] isregex3) {
        this.isregex3 = isregex3;
    }


    /**
     * Gets the formactionurl3 value for this Appfwprofile.
     * 
     * @return formactionurl3
     */
    public java.lang.String[] getFormactionurl3() {
        return formactionurl3;
    }


    /**
     * Sets the formactionurl3 value for this Appfwprofile.
     * 
     * @param formactionurl3
     */
    public void setFormactionurl3(java.lang.String[] formactionurl3) {
        this.formactionurl3 = formactionurl3;
    }


    /**
     * Gets the cookieconsistencyaction value for this Appfwprofile.
     * 
     * @return cookieconsistencyaction
     */
    public java.lang.String getCookieconsistencyaction() {
        return cookieconsistencyaction;
    }


    /**
     * Sets the cookieconsistencyaction value for this Appfwprofile.
     * 
     * @param cookieconsistencyaction
     */
    public void setCookieconsistencyaction(java.lang.String cookieconsistencyaction) {
        this.cookieconsistencyaction = cookieconsistencyaction;
    }


    /**
     * Gets the cookieconsistency value for this Appfwprofile.
     * 
     * @return cookieconsistency
     */
    public java.lang.String[] getCookieconsistency() {
        return cookieconsistency;
    }


    /**
     * Sets the cookieconsistency value for this Appfwprofile.
     * 
     * @param cookieconsistency
     */
    public void setCookieconsistency(java.lang.String[] cookieconsistency) {
        this.cookieconsistency = cookieconsistency;
    }


    /**
     * Gets the isregex4 value for this Appfwprofile.
     * 
     * @return isregex4
     */
    public java.lang.String[] getIsregex4() {
        return isregex4;
    }


    /**
     * Sets the isregex4 value for this Appfwprofile.
     * 
     * @param isregex4
     */
    public void setIsregex4(java.lang.String[] isregex4) {
        this.isregex4 = isregex4;
    }


    /**
     * Gets the cookietransforms value for this Appfwprofile.
     * 
     * @return cookietransforms
     */
    public java.lang.String getCookietransforms() {
        return cookietransforms;
    }


    /**
     * Sets the cookietransforms value for this Appfwprofile.
     * 
     * @param cookietransforms
     */
    public void setCookietransforms(java.lang.String cookietransforms) {
        this.cookietransforms = cookietransforms;
    }


    /**
     * Gets the cookieencryption value for this Appfwprofile.
     * 
     * @return cookieencryption
     */
    public java.lang.String getCookieencryption() {
        return cookieencryption;
    }


    /**
     * Sets the cookieencryption value for this Appfwprofile.
     * 
     * @param cookieencryption
     */
    public void setCookieencryption(java.lang.String cookieencryption) {
        this.cookieencryption = cookieencryption;
    }


    /**
     * Gets the cookieproxying value for this Appfwprofile.
     * 
     * @return cookieproxying
     */
    public java.lang.String getCookieproxying() {
        return cookieproxying;
    }


    /**
     * Sets the cookieproxying value for this Appfwprofile.
     * 
     * @param cookieproxying
     */
    public void setCookieproxying(java.lang.String cookieproxying) {
        this.cookieproxying = cookieproxying;
    }


    /**
     * Gets the addcookieflags value for this Appfwprofile.
     * 
     * @return addcookieflags
     */
    public java.lang.String getAddcookieflags() {
        return addcookieflags;
    }


    /**
     * Sets the addcookieflags value for this Appfwprofile.
     * 
     * @param addcookieflags
     */
    public void setAddcookieflags(java.lang.String addcookieflags) {
        this.addcookieflags = addcookieflags;
    }


    /**
     * Gets the bufferoverflowaction value for this Appfwprofile.
     * 
     * @return bufferoverflowaction
     */
    public java.lang.String getBufferoverflowaction() {
        return bufferoverflowaction;
    }


    /**
     * Sets the bufferoverflowaction value for this Appfwprofile.
     * 
     * @param bufferoverflowaction
     */
    public void setBufferoverflowaction(java.lang.String bufferoverflowaction) {
        this.bufferoverflowaction = bufferoverflowaction;
    }


    /**
     * Gets the bufferoverflowmaxurllength value for this Appfwprofile.
     * 
     * @return bufferoverflowmaxurllength
     */
    public org.apache.axis.types.UnsignedInt getBufferoverflowmaxurllength() {
        return bufferoverflowmaxurllength;
    }


    /**
     * Sets the bufferoverflowmaxurllength value for this Appfwprofile.
     * 
     * @param bufferoverflowmaxurllength
     */
    public void setBufferoverflowmaxurllength(org.apache.axis.types.UnsignedInt bufferoverflowmaxurllength) {
        this.bufferoverflowmaxurllength = bufferoverflowmaxurllength;
    }


    /**
     * Gets the bufferoverflowmaxheaderlength value for this Appfwprofile.
     * 
     * @return bufferoverflowmaxheaderlength
     */
    public org.apache.axis.types.UnsignedInt getBufferoverflowmaxheaderlength() {
        return bufferoverflowmaxheaderlength;
    }


    /**
     * Sets the bufferoverflowmaxheaderlength value for this Appfwprofile.
     * 
     * @param bufferoverflowmaxheaderlength
     */
    public void setBufferoverflowmaxheaderlength(org.apache.axis.types.UnsignedInt bufferoverflowmaxheaderlength) {
        this.bufferoverflowmaxheaderlength = bufferoverflowmaxheaderlength;
    }


    /**
     * Gets the bufferoverflowmaxcookielength value for this Appfwprofile.
     * 
     * @return bufferoverflowmaxcookielength
     */
    public org.apache.axis.types.UnsignedInt getBufferoverflowmaxcookielength() {
        return bufferoverflowmaxcookielength;
    }


    /**
     * Sets the bufferoverflowmaxcookielength value for this Appfwprofile.
     * 
     * @param bufferoverflowmaxcookielength
     */
    public void setBufferoverflowmaxcookielength(org.apache.axis.types.UnsignedInt bufferoverflowmaxcookielength) {
        this.bufferoverflowmaxcookielength = bufferoverflowmaxcookielength;
    }


    /**
     * Gets the fieldformataction value for this Appfwprofile.
     * 
     * @return fieldformataction
     */
    public java.lang.String getFieldformataction() {
        return fieldformataction;
    }


    /**
     * Sets the fieldformataction value for this Appfwprofile.
     * 
     * @param fieldformataction
     */
    public void setFieldformataction(java.lang.String fieldformataction) {
        this.fieldformataction = fieldformataction;
    }


    /**
     * Gets the defaultfieldformattype value for this Appfwprofile.
     * 
     * @return defaultfieldformattype
     */
    public java.lang.String getDefaultfieldformattype() {
        return defaultfieldformattype;
    }


    /**
     * Sets the defaultfieldformattype value for this Appfwprofile.
     * 
     * @param defaultfieldformattype
     */
    public void setDefaultfieldformattype(java.lang.String defaultfieldformattype) {
        this.defaultfieldformattype = defaultfieldformattype;
    }


    /**
     * Gets the defaultfieldformatminlength value for this Appfwprofile.
     * 
     * @return defaultfieldformatminlength
     */
    public org.apache.axis.types.UnsignedInt getDefaultfieldformatminlength() {
        return defaultfieldformatminlength;
    }


    /**
     * Sets the defaultfieldformatminlength value for this Appfwprofile.
     * 
     * @param defaultfieldformatminlength
     */
    public void setDefaultfieldformatminlength(org.apache.axis.types.UnsignedInt defaultfieldformatminlength) {
        this.defaultfieldformatminlength = defaultfieldformatminlength;
    }


    /**
     * Gets the defaultfieldformatmaxlength value for this Appfwprofile.
     * 
     * @return defaultfieldformatmaxlength
     */
    public org.apache.axis.types.UnsignedInt getDefaultfieldformatmaxlength() {
        return defaultfieldformatmaxlength;
    }


    /**
     * Sets the defaultfieldformatmaxlength value for this Appfwprofile.
     * 
     * @param defaultfieldformatmaxlength
     */
    public void setDefaultfieldformatmaxlength(org.apache.axis.types.UnsignedInt defaultfieldformatmaxlength) {
        this.defaultfieldformatmaxlength = defaultfieldformatmaxlength;
    }


    /**
     * Gets the fieldformat value for this Appfwprofile.
     * 
     * @return fieldformat
     */
    public java.lang.String[] getFieldformat() {
        return fieldformat;
    }


    /**
     * Sets the fieldformat value for this Appfwprofile.
     * 
     * @param fieldformat
     */
    public void setFieldformat(java.lang.String[] fieldformat) {
        this.fieldformat = fieldformat;
    }


    /**
     * Gets the isregex5 value for this Appfwprofile.
     * 
     * @return isregex5
     */
    public java.lang.String[] getIsregex5() {
        return isregex5;
    }


    /**
     * Sets the isregex5 value for this Appfwprofile.
     * 
     * @param isregex5
     */
    public void setIsregex5(java.lang.String[] isregex5) {
        this.isregex5 = isregex5;
    }


    /**
     * Gets the formactionurl4 value for this Appfwprofile.
     * 
     * @return formactionurl4
     */
    public java.lang.String[] getFormactionurl4() {
        return formactionurl4;
    }


    /**
     * Sets the formactionurl4 value for this Appfwprofile.
     * 
     * @param formactionurl4
     */
    public void setFormactionurl4(java.lang.String[] formactionurl4) {
        this.formactionurl4 = formactionurl4;
    }


    /**
     * Gets the fieldtype value for this Appfwprofile.
     * 
     * @return fieldtype
     */
    public java.lang.String[] getFieldtype() {
        return fieldtype;
    }


    /**
     * Sets the fieldtype value for this Appfwprofile.
     * 
     * @param fieldtype
     */
    public void setFieldtype(java.lang.String[] fieldtype) {
        this.fieldtype = fieldtype;
    }


    /**
     * Gets the fieldformatminlength value for this Appfwprofile.
     * 
     * @return fieldformatminlength
     */
    public org.apache.axis.types.UnsignedInt[] getFieldformatminlength() {
        return fieldformatminlength;
    }


    /**
     * Sets the fieldformatminlength value for this Appfwprofile.
     * 
     * @param fieldformatminlength
     */
    public void setFieldformatminlength(org.apache.axis.types.UnsignedInt[] fieldformatminlength) {
        this.fieldformatminlength = fieldformatminlength;
    }


    /**
     * Gets the fieldformatmaxlength value for this Appfwprofile.
     * 
     * @return fieldformatmaxlength
     */
    public org.apache.axis.types.UnsignedInt[] getFieldformatmaxlength() {
        return fieldformatmaxlength;
    }


    /**
     * Sets the fieldformatmaxlength value for this Appfwprofile.
     * 
     * @param fieldformatmaxlength
     */
    public void setFieldformatmaxlength(org.apache.axis.types.UnsignedInt[] fieldformatmaxlength) {
        this.fieldformatmaxlength = fieldformatmaxlength;
    }


    /**
     * Gets the creditcardaction value for this Appfwprofile.
     * 
     * @return creditcardaction
     */
    public java.lang.String getCreditcardaction() {
        return creditcardaction;
    }


    /**
     * Sets the creditcardaction value for this Appfwprofile.
     * 
     * @param creditcardaction
     */
    public void setCreditcardaction(java.lang.String creditcardaction) {
        this.creditcardaction = creditcardaction;
    }


    /**
     * Gets the creditcard value for this Appfwprofile.
     * 
     * @return creditcard
     */
    public java.lang.String getCreditcard() {
        return creditcard;
    }


    /**
     * Sets the creditcard value for this Appfwprofile.
     * 
     * @param creditcard
     */
    public void setCreditcard(java.lang.String creditcard) {
        this.creditcard = creditcard;
    }


    /**
     * Gets the creditcardmaxallowed value for this Appfwprofile.
     * 
     * @return creditcardmaxallowed
     */
    public org.apache.axis.types.UnsignedInt getCreditcardmaxallowed() {
        return creditcardmaxallowed;
    }


    /**
     * Sets the creditcardmaxallowed value for this Appfwprofile.
     * 
     * @param creditcardmaxallowed
     */
    public void setCreditcardmaxallowed(org.apache.axis.types.UnsignedInt creditcardmaxallowed) {
        this.creditcardmaxallowed = creditcardmaxallowed;
    }


    /**
     * Gets the creditcardxout value for this Appfwprofile.
     * 
     * @return creditcardxout
     */
    public java.lang.String getCreditcardxout() {
        return creditcardxout;
    }


    /**
     * Sets the creditcardxout value for this Appfwprofile.
     * 
     * @param creditcardxout
     */
    public void setCreditcardxout(java.lang.String creditcardxout) {
        this.creditcardxout = creditcardxout;
    }


    /**
     * Gets the safeobject value for this Appfwprofile.
     * 
     * @return safeobject
     */
    public java.lang.String[] getSafeobject() {
        return safeobject;
    }


    /**
     * Sets the safeobject value for this Appfwprofile.
     * 
     * @param safeobject
     */
    public void setSafeobject(java.lang.String[] safeobject) {
        this.safeobject = safeobject;
    }


    /**
     * Gets the expression value for this Appfwprofile.
     * 
     * @return expression
     */
    public java.lang.String[] getExpression() {
        return expression;
    }


    /**
     * Sets the expression value for this Appfwprofile.
     * 
     * @param expression
     */
    public void setExpression(java.lang.String[] expression) {
        this.expression = expression;
    }


    /**
     * Gets the maxmatchlength value for this Appfwprofile.
     * 
     * @return maxmatchlength
     */
    public org.apache.axis.types.UnsignedInt[] getMaxmatchlength() {
        return maxmatchlength;
    }


    /**
     * Sets the maxmatchlength value for this Appfwprofile.
     * 
     * @param maxmatchlength
     */
    public void setMaxmatchlength(org.apache.axis.types.UnsignedInt[] maxmatchlength) {
        this.maxmatchlength = maxmatchlength;
    }


    /**
     * Gets the actioN value for this Appfwprofile.
     * 
     * @return actioN
     */
    public java.lang.String[] getActioN() {
        return actioN;
    }


    /**
     * Sets the actioN value for this Appfwprofile.
     * 
     * @param actioN
     */
    public void setActioN(java.lang.String[] actioN) {
        this.actioN = actioN;
    }


    /**
     * Gets the requestcontenttype value for this Appfwprofile.
     * 
     * @return requestcontenttype
     */
    public java.lang.String getRequestcontenttype() {
        return requestcontenttype;
    }


    /**
     * Sets the requestcontenttype value for this Appfwprofile.
     * 
     * @param requestcontenttype
     */
    public void setRequestcontenttype(java.lang.String requestcontenttype) {
        this.requestcontenttype = requestcontenttype;
    }


    /**
     * Gets the responsecontenttype value for this Appfwprofile.
     * 
     * @return responsecontenttype
     */
    public java.lang.String getResponsecontenttype() {
        return responsecontenttype;
    }


    /**
     * Sets the responsecontenttype value for this Appfwprofile.
     * 
     * @param responsecontenttype
     */
    public void setResponsecontenttype(java.lang.String responsecontenttype) {
        this.responsecontenttype = responsecontenttype;
    }


    /**
     * Gets the xmlerrorobject value for this Appfwprofile.
     * 
     * @return xmlerrorobject
     */
    public java.lang.String getXmlerrorobject() {
        return xmlerrorobject;
    }


    /**
     * Sets the xmlerrorobject value for this Appfwprofile.
     * 
     * @param xmlerrorobject
     */
    public void setXmlerrorobject(java.lang.String xmlerrorobject) {
        this.xmlerrorobject = xmlerrorobject;
    }


    /**
     * Gets the signatures value for this Appfwprofile.
     * 
     * @return signatures
     */
    public java.lang.String getSignatures() {
        return signatures;
    }


    /**
     * Sets the signatures value for this Appfwprofile.
     * 
     * @param signatures
     */
    public void setSignatures(java.lang.String signatures) {
        this.signatures = signatures;
    }


    /**
     * Gets the _xmlformataction value for this Appfwprofile.
     * 
     * @return _xmlformataction
     */
    public java.lang.String get_xmlformataction() {
        return _xmlformataction;
    }


    /**
     * Sets the _xmlformataction value for this Appfwprofile.
     * 
     * @param _xmlformataction
     */
    public void set_xmlformataction(java.lang.String _xmlformataction) {
        this._xmlformataction = _xmlformataction;
    }


    /**
     * Gets the _xmldosaction value for this Appfwprofile.
     * 
     * @return _xmldosaction
     */
    public java.lang.String get_xmldosaction() {
        return _xmldosaction;
    }


    /**
     * Sets the _xmldosaction value for this Appfwprofile.
     * 
     * @param _xmldosaction
     */
    public void set_xmldosaction(java.lang.String _xmldosaction) {
        this._xmldosaction = _xmldosaction;
    }


    /**
     * Gets the _xmlsqlinjectionaction value for this Appfwprofile.
     * 
     * @return _xmlsqlinjectionaction
     */
    public java.lang.String get_xmlsqlinjectionaction() {
        return _xmlsqlinjectionaction;
    }


    /**
     * Sets the _xmlsqlinjectionaction value for this Appfwprofile.
     * 
     * @param _xmlsqlinjectionaction
     */
    public void set_xmlsqlinjectionaction(java.lang.String _xmlsqlinjectionaction) {
        this._xmlsqlinjectionaction = _xmlsqlinjectionaction;
    }


    /**
     * Gets the xmlsqlinjectiononlycheckfieldswithsqlchars value for this Appfwprofile.
     * 
     * @return xmlsqlinjectiononlycheckfieldswithsqlchars
     */
    public java.lang.String getXmlsqlinjectiononlycheckfieldswithsqlchars() {
        return xmlsqlinjectiononlycheckfieldswithsqlchars;
    }


    /**
     * Sets the xmlsqlinjectiononlycheckfieldswithsqlchars value for this Appfwprofile.
     * 
     * @param xmlsqlinjectiononlycheckfieldswithsqlchars
     */
    public void setXmlsqlinjectiononlycheckfieldswithsqlchars(java.lang.String xmlsqlinjectiononlycheckfieldswithsqlchars) {
        this.xmlsqlinjectiononlycheckfieldswithsqlchars = xmlsqlinjectiononlycheckfieldswithsqlchars;
    }


    /**
     * Gets the xmlsqlinjectionchecksqlwildchars value for this Appfwprofile.
     * 
     * @return xmlsqlinjectionchecksqlwildchars
     */
    public java.lang.String getXmlsqlinjectionchecksqlwildchars() {
        return xmlsqlinjectionchecksqlwildchars;
    }


    /**
     * Sets the xmlsqlinjectionchecksqlwildchars value for this Appfwprofile.
     * 
     * @param xmlsqlinjectionchecksqlwildchars
     */
    public void setXmlsqlinjectionchecksqlwildchars(java.lang.String xmlsqlinjectionchecksqlwildchars) {
        this.xmlsqlinjectionchecksqlwildchars = xmlsqlinjectionchecksqlwildchars;
    }


    /**
     * Gets the xmlsqlinjectionparsecomments value for this Appfwprofile.
     * 
     * @return xmlsqlinjectionparsecomments
     */
    public java.lang.String getXmlsqlinjectionparsecomments() {
        return xmlsqlinjectionparsecomments;
    }


    /**
     * Sets the xmlsqlinjectionparsecomments value for this Appfwprofile.
     * 
     * @param xmlsqlinjectionparsecomments
     */
    public void setXmlsqlinjectionparsecomments(java.lang.String xmlsqlinjectionparsecomments) {
        this.xmlsqlinjectionparsecomments = xmlsqlinjectionparsecomments;
    }


    /**
     * Gets the _xmlxssaction value for this Appfwprofile.
     * 
     * @return _xmlxssaction
     */
    public java.lang.String get_xmlxssaction() {
        return _xmlxssaction;
    }


    /**
     * Sets the _xmlxssaction value for this Appfwprofile.
     * 
     * @param _xmlxssaction
     */
    public void set_xmlxssaction(java.lang.String _xmlxssaction) {
        this._xmlxssaction = _xmlxssaction;
    }


    /**
     * Gets the _xmlwsiaction value for this Appfwprofile.
     * 
     * @return _xmlwsiaction
     */
    public java.lang.String get_xmlwsiaction() {
        return _xmlwsiaction;
    }


    /**
     * Sets the _xmlwsiaction value for this Appfwprofile.
     * 
     * @param _xmlwsiaction
     */
    public void set_xmlwsiaction(java.lang.String _xmlwsiaction) {
        this._xmlwsiaction = _xmlwsiaction;
    }


    /**
     * Gets the _xmlattachmentaction value for this Appfwprofile.
     * 
     * @return _xmlattachmentaction
     */
    public java.lang.String get_xmlattachmentaction() {
        return _xmlattachmentaction;
    }


    /**
     * Sets the _xmlattachmentaction value for this Appfwprofile.
     * 
     * @param _xmlattachmentaction
     */
    public void set_xmlattachmentaction(java.lang.String _xmlattachmentaction) {
        this._xmlattachmentaction = _xmlattachmentaction;
    }


    /**
     * Gets the _xmlvalidationaction value for this Appfwprofile.
     * 
     * @return _xmlvalidationaction
     */
    public java.lang.String get_xmlvalidationaction() {
        return _xmlvalidationaction;
    }


    /**
     * Sets the _xmlvalidationaction value for this Appfwprofile.
     * 
     * @param _xmlvalidationaction
     */
    public void set_xmlvalidationaction(java.lang.String _xmlvalidationaction) {
        this._xmlvalidationaction = _xmlvalidationaction;
    }


    /**
     * Gets the xmlsoapfaultaction value for this Appfwprofile.
     * 
     * @return xmlsoapfaultaction
     */
    public java.lang.String getXmlsoapfaultaction() {
        return xmlsoapfaultaction;
    }


    /**
     * Sets the xmlsoapfaultaction value for this Appfwprofile.
     * 
     * @param xmlsoapfaultaction
     */
    public void setXmlsoapfaultaction(java.lang.String xmlsoapfaultaction) {
        this.xmlsoapfaultaction = xmlsoapfaultaction;
    }


    /**
     * Gets the xmldosurl value for this Appfwprofile.
     * 
     * @return xmldosurl
     */
    public java.lang.String[] getXmldosurl() {
        return xmldosurl;
    }


    /**
     * Sets the xmldosurl value for this Appfwprofile.
     * 
     * @param xmldosurl
     */
    public void setXmldosurl(java.lang.String[] xmldosurl) {
        this.xmldosurl = xmldosurl;
    }


    /**
     * Gets the xmlwsiurl value for this Appfwprofile.
     * 
     * @return xmlwsiurl
     */
    public java.lang.String[] getXmlwsiurl() {
        return xmlwsiurl;
    }


    /**
     * Sets the xmlwsiurl value for this Appfwprofile.
     * 
     * @param xmlwsiurl
     */
    public void setXmlwsiurl(java.lang.String[] xmlwsiurl) {
        this.xmlwsiurl = xmlwsiurl;
    }


    /**
     * Gets the xmlvalidationurl value for this Appfwprofile.
     * 
     * @return xmlvalidationurl
     */
    public java.lang.String[] getXmlvalidationurl() {
        return xmlvalidationurl;
    }


    /**
     * Sets the xmlvalidationurl value for this Appfwprofile.
     * 
     * @param xmlvalidationurl
     */
    public void setXmlvalidationurl(java.lang.String[] xmlvalidationurl) {
        this.xmlvalidationurl = xmlvalidationurl;
    }


    /**
     * Gets the xmlattachmenturl value for this Appfwprofile.
     * 
     * @return xmlattachmenturl
     */
    public java.lang.String[] getXmlattachmenturl() {
        return xmlattachmenturl;
    }


    /**
     * Sets the xmlattachmenturl value for this Appfwprofile.
     * 
     * @param xmlattachmenturl
     */
    public void setXmlattachmenturl(java.lang.String[] xmlattachmenturl) {
        this.xmlattachmenturl = xmlattachmenturl;
    }


    /**
     * Gets the xmlsqlinjection value for this Appfwprofile.
     * 
     * @return xmlsqlinjection
     */
    public java.lang.String[] getXmlsqlinjection() {
        return xmlsqlinjection;
    }


    /**
     * Sets the xmlsqlinjection value for this Appfwprofile.
     * 
     * @param xmlsqlinjection
     */
    public void setXmlsqlinjection(java.lang.String[] xmlsqlinjection) {
        this.xmlsqlinjection = xmlsqlinjection;
    }


    /**
     * Gets the isregex6 value for this Appfwprofile.
     * 
     * @return isregex6
     */
    public java.lang.String[] getIsregex6() {
        return isregex6;
    }


    /**
     * Sets the isregex6 value for this Appfwprofile.
     * 
     * @param isregex6
     */
    public void setIsregex6(java.lang.String[] isregex6) {
        this.isregex6 = isregex6;
    }


    /**
     * Gets the location3 value for this Appfwprofile.
     * 
     * @return location3
     */
    public java.lang.String[] getLocation3() {
        return location3;
    }


    /**
     * Sets the location3 value for this Appfwprofile.
     * 
     * @param location3
     */
    public void setLocation3(java.lang.String[] location3) {
        this.location3 = location3;
    }


    /**
     * Gets the xmlxss value for this Appfwprofile.
     * 
     * @return xmlxss
     */
    public java.lang.String[] getXmlxss() {
        return xmlxss;
    }


    /**
     * Sets the xmlxss value for this Appfwprofile.
     * 
     * @param xmlxss
     */
    public void setXmlxss(java.lang.String[] xmlxss) {
        this.xmlxss = xmlxss;
    }


    /**
     * Gets the isregex7 value for this Appfwprofile.
     * 
     * @return isregex7
     */
    public java.lang.String[] getIsregex7() {
        return isregex7;
    }


    /**
     * Sets the isregex7 value for this Appfwprofile.
     * 
     * @param isregex7
     */
    public void setIsregex7(java.lang.String[] isregex7) {
        this.isregex7 = isregex7;
    }


    /**
     * Gets the location4 value for this Appfwprofile.
     * 
     * @return location4
     */
    public java.lang.String[] getLocation4() {
        return location4;
    }


    /**
     * Sets the location4 value for this Appfwprofile.
     * 
     * @param location4
     */
    public void setLocation4(java.lang.String[] location4) {
        this.location4 = location4;
    }


    /**
     * Gets the state value for this Appfwprofile.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Appfwprofile.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the xmlmaxelementdepthcheck value for this Appfwprofile.
     * 
     * @return xmlmaxelementdepthcheck
     */
    public java.lang.String[] getXmlmaxelementdepthcheck() {
        return xmlmaxelementdepthcheck;
    }


    /**
     * Sets the xmlmaxelementdepthcheck value for this Appfwprofile.
     * 
     * @param xmlmaxelementdepthcheck
     */
    public void setXmlmaxelementdepthcheck(java.lang.String[] xmlmaxelementdepthcheck) {
        this.xmlmaxelementdepthcheck = xmlmaxelementdepthcheck;
    }


    /**
     * Gets the xmlmaxelementdepth value for this Appfwprofile.
     * 
     * @return xmlmaxelementdepth
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxelementdepth() {
        return xmlmaxelementdepth;
    }


    /**
     * Sets the xmlmaxelementdepth value for this Appfwprofile.
     * 
     * @param xmlmaxelementdepth
     */
    public void setXmlmaxelementdepth(org.apache.axis.types.UnsignedInt[] xmlmaxelementdepth) {
        this.xmlmaxelementdepth = xmlmaxelementdepth;
    }


    /**
     * Gets the xmlmaxelementnamelengthcheck value for this Appfwprofile.
     * 
     * @return xmlmaxelementnamelengthcheck
     */
    public java.lang.String[] getXmlmaxelementnamelengthcheck() {
        return xmlmaxelementnamelengthcheck;
    }


    /**
     * Sets the xmlmaxelementnamelengthcheck value for this Appfwprofile.
     * 
     * @param xmlmaxelementnamelengthcheck
     */
    public void setXmlmaxelementnamelengthcheck(java.lang.String[] xmlmaxelementnamelengthcheck) {
        this.xmlmaxelementnamelengthcheck = xmlmaxelementnamelengthcheck;
    }


    /**
     * Gets the xmlmaxelementnamelength value for this Appfwprofile.
     * 
     * @return xmlmaxelementnamelength
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxelementnamelength() {
        return xmlmaxelementnamelength;
    }


    /**
     * Sets the xmlmaxelementnamelength value for this Appfwprofile.
     * 
     * @param xmlmaxelementnamelength
     */
    public void setXmlmaxelementnamelength(org.apache.axis.types.UnsignedInt[] xmlmaxelementnamelength) {
        this.xmlmaxelementnamelength = xmlmaxelementnamelength;
    }


    /**
     * Gets the xmlmaxelementscheck value for this Appfwprofile.
     * 
     * @return xmlmaxelementscheck
     */
    public java.lang.String[] getXmlmaxelementscheck() {
        return xmlmaxelementscheck;
    }


    /**
     * Sets the xmlmaxelementscheck value for this Appfwprofile.
     * 
     * @param xmlmaxelementscheck
     */
    public void setXmlmaxelementscheck(java.lang.String[] xmlmaxelementscheck) {
        this.xmlmaxelementscheck = xmlmaxelementscheck;
    }


    /**
     * Gets the xmlmaxelements value for this Appfwprofile.
     * 
     * @return xmlmaxelements
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxelements() {
        return xmlmaxelements;
    }


    /**
     * Sets the xmlmaxelements value for this Appfwprofile.
     * 
     * @param xmlmaxelements
     */
    public void setXmlmaxelements(org.apache.axis.types.UnsignedInt[] xmlmaxelements) {
        this.xmlmaxelements = xmlmaxelements;
    }


    /**
     * Gets the xmlmaxelementchildrencheck value for this Appfwprofile.
     * 
     * @return xmlmaxelementchildrencheck
     */
    public java.lang.String[] getXmlmaxelementchildrencheck() {
        return xmlmaxelementchildrencheck;
    }


    /**
     * Sets the xmlmaxelementchildrencheck value for this Appfwprofile.
     * 
     * @param xmlmaxelementchildrencheck
     */
    public void setXmlmaxelementchildrencheck(java.lang.String[] xmlmaxelementchildrencheck) {
        this.xmlmaxelementchildrencheck = xmlmaxelementchildrencheck;
    }


    /**
     * Gets the xmlmaxelementchildren value for this Appfwprofile.
     * 
     * @return xmlmaxelementchildren
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxelementchildren() {
        return xmlmaxelementchildren;
    }


    /**
     * Sets the xmlmaxelementchildren value for this Appfwprofile.
     * 
     * @param xmlmaxelementchildren
     */
    public void setXmlmaxelementchildren(org.apache.axis.types.UnsignedInt[] xmlmaxelementchildren) {
        this.xmlmaxelementchildren = xmlmaxelementchildren;
    }


    /**
     * Gets the xmlmaxnodescheck value for this Appfwprofile.
     * 
     * @return xmlmaxnodescheck
     */
    public java.lang.String[] getXmlmaxnodescheck() {
        return xmlmaxnodescheck;
    }


    /**
     * Sets the xmlmaxnodescheck value for this Appfwprofile.
     * 
     * @param xmlmaxnodescheck
     */
    public void setXmlmaxnodescheck(java.lang.String[] xmlmaxnodescheck) {
        this.xmlmaxnodescheck = xmlmaxnodescheck;
    }


    /**
     * Gets the xmlmaxnodes value for this Appfwprofile.
     * 
     * @return xmlmaxnodes
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxnodes() {
        return xmlmaxnodes;
    }


    /**
     * Sets the xmlmaxnodes value for this Appfwprofile.
     * 
     * @param xmlmaxnodes
     */
    public void setXmlmaxnodes(org.apache.axis.types.UnsignedInt[] xmlmaxnodes) {
        this.xmlmaxnodes = xmlmaxnodes;
    }


    /**
     * Gets the xmlmaxattributescheck value for this Appfwprofile.
     * 
     * @return xmlmaxattributescheck
     */
    public java.lang.String[] getXmlmaxattributescheck() {
        return xmlmaxattributescheck;
    }


    /**
     * Sets the xmlmaxattributescheck value for this Appfwprofile.
     * 
     * @param xmlmaxattributescheck
     */
    public void setXmlmaxattributescheck(java.lang.String[] xmlmaxattributescheck) {
        this.xmlmaxattributescheck = xmlmaxattributescheck;
    }


    /**
     * Gets the xmlmaxattributes value for this Appfwprofile.
     * 
     * @return xmlmaxattributes
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxattributes() {
        return xmlmaxattributes;
    }


    /**
     * Sets the xmlmaxattributes value for this Appfwprofile.
     * 
     * @param xmlmaxattributes
     */
    public void setXmlmaxattributes(org.apache.axis.types.UnsignedInt[] xmlmaxattributes) {
        this.xmlmaxattributes = xmlmaxattributes;
    }


    /**
     * Gets the xmlmaxattributenamelengthcheck value for this Appfwprofile.
     * 
     * @return xmlmaxattributenamelengthcheck
     */
    public java.lang.String[] getXmlmaxattributenamelengthcheck() {
        return xmlmaxattributenamelengthcheck;
    }


    /**
     * Sets the xmlmaxattributenamelengthcheck value for this Appfwprofile.
     * 
     * @param xmlmaxattributenamelengthcheck
     */
    public void setXmlmaxattributenamelengthcheck(java.lang.String[] xmlmaxattributenamelengthcheck) {
        this.xmlmaxattributenamelengthcheck = xmlmaxattributenamelengthcheck;
    }


    /**
     * Gets the xmlmaxattributenamelength value for this Appfwprofile.
     * 
     * @return xmlmaxattributenamelength
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxattributenamelength() {
        return xmlmaxattributenamelength;
    }


    /**
     * Sets the xmlmaxattributenamelength value for this Appfwprofile.
     * 
     * @param xmlmaxattributenamelength
     */
    public void setXmlmaxattributenamelength(org.apache.axis.types.UnsignedInt[] xmlmaxattributenamelength) {
        this.xmlmaxattributenamelength = xmlmaxattributenamelength;
    }


    /**
     * Gets the xmlmaxattributevaluelengthcheck value for this Appfwprofile.
     * 
     * @return xmlmaxattributevaluelengthcheck
     */
    public java.lang.String[] getXmlmaxattributevaluelengthcheck() {
        return xmlmaxattributevaluelengthcheck;
    }


    /**
     * Sets the xmlmaxattributevaluelengthcheck value for this Appfwprofile.
     * 
     * @param xmlmaxattributevaluelengthcheck
     */
    public void setXmlmaxattributevaluelengthcheck(java.lang.String[] xmlmaxattributevaluelengthcheck) {
        this.xmlmaxattributevaluelengthcheck = xmlmaxattributevaluelengthcheck;
    }


    /**
     * Gets the xmlmaxattributevaluelength value for this Appfwprofile.
     * 
     * @return xmlmaxattributevaluelength
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxattributevaluelength() {
        return xmlmaxattributevaluelength;
    }


    /**
     * Sets the xmlmaxattributevaluelength value for this Appfwprofile.
     * 
     * @param xmlmaxattributevaluelength
     */
    public void setXmlmaxattributevaluelength(org.apache.axis.types.UnsignedInt[] xmlmaxattributevaluelength) {
        this.xmlmaxattributevaluelength = xmlmaxattributevaluelength;
    }


    /**
     * Gets the xmlmaxchardatalengthcheck value for this Appfwprofile.
     * 
     * @return xmlmaxchardatalengthcheck
     */
    public java.lang.String[] getXmlmaxchardatalengthcheck() {
        return xmlmaxchardatalengthcheck;
    }


    /**
     * Sets the xmlmaxchardatalengthcheck value for this Appfwprofile.
     * 
     * @param xmlmaxchardatalengthcheck
     */
    public void setXmlmaxchardatalengthcheck(java.lang.String[] xmlmaxchardatalengthcheck) {
        this.xmlmaxchardatalengthcheck = xmlmaxchardatalengthcheck;
    }


    /**
     * Gets the xmlmaxchardatalength value for this Appfwprofile.
     * 
     * @return xmlmaxchardatalength
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxchardatalength() {
        return xmlmaxchardatalength;
    }


    /**
     * Sets the xmlmaxchardatalength value for this Appfwprofile.
     * 
     * @param xmlmaxchardatalength
     */
    public void setXmlmaxchardatalength(org.apache.axis.types.UnsignedInt[] xmlmaxchardatalength) {
        this.xmlmaxchardatalength = xmlmaxchardatalength;
    }


    /**
     * Gets the xmlmaxfilesizecheck value for this Appfwprofile.
     * 
     * @return xmlmaxfilesizecheck
     */
    public java.lang.String[] getXmlmaxfilesizecheck() {
        return xmlmaxfilesizecheck;
    }


    /**
     * Sets the xmlmaxfilesizecheck value for this Appfwprofile.
     * 
     * @param xmlmaxfilesizecheck
     */
    public void setXmlmaxfilesizecheck(java.lang.String[] xmlmaxfilesizecheck) {
        this.xmlmaxfilesizecheck = xmlmaxfilesizecheck;
    }


    /**
     * Gets the xmlmaxfilesize value for this Appfwprofile.
     * 
     * @return xmlmaxfilesize
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxfilesize() {
        return xmlmaxfilesize;
    }


    /**
     * Sets the xmlmaxfilesize value for this Appfwprofile.
     * 
     * @param xmlmaxfilesize
     */
    public void setXmlmaxfilesize(org.apache.axis.types.UnsignedInt[] xmlmaxfilesize) {
        this.xmlmaxfilesize = xmlmaxfilesize;
    }


    /**
     * Gets the xmlminfilesizecheck value for this Appfwprofile.
     * 
     * @return xmlminfilesizecheck
     */
    public java.lang.String[] getXmlminfilesizecheck() {
        return xmlminfilesizecheck;
    }


    /**
     * Sets the xmlminfilesizecheck value for this Appfwprofile.
     * 
     * @param xmlminfilesizecheck
     */
    public void setXmlminfilesizecheck(java.lang.String[] xmlminfilesizecheck) {
        this.xmlminfilesizecheck = xmlminfilesizecheck;
    }


    /**
     * Gets the xmlminfilesize value for this Appfwprofile.
     * 
     * @return xmlminfilesize
     */
    public org.apache.axis.types.UnsignedInt[] getXmlminfilesize() {
        return xmlminfilesize;
    }


    /**
     * Sets the xmlminfilesize value for this Appfwprofile.
     * 
     * @param xmlminfilesize
     */
    public void setXmlminfilesize(org.apache.axis.types.UnsignedInt[] xmlminfilesize) {
        this.xmlminfilesize = xmlminfilesize;
    }


    /**
     * Gets the xmlblockpi value for this Appfwprofile.
     * 
     * @return xmlblockpi
     */
    public java.lang.String[] getXmlblockpi() {
        return xmlblockpi;
    }


    /**
     * Sets the xmlblockpi value for this Appfwprofile.
     * 
     * @param xmlblockpi
     */
    public void setXmlblockpi(java.lang.String[] xmlblockpi) {
        this.xmlblockpi = xmlblockpi;
    }


    /**
     * Gets the xmlblockdtd value for this Appfwprofile.
     * 
     * @return xmlblockdtd
     */
    public java.lang.String[] getXmlblockdtd() {
        return xmlblockdtd;
    }


    /**
     * Sets the xmlblockdtd value for this Appfwprofile.
     * 
     * @param xmlblockdtd
     */
    public void setXmlblockdtd(java.lang.String[] xmlblockdtd) {
        this.xmlblockdtd = xmlblockdtd;
    }


    /**
     * Gets the xmlblockexternalentities value for this Appfwprofile.
     * 
     * @return xmlblockexternalentities
     */
    public java.lang.String[] getXmlblockexternalentities() {
        return xmlblockexternalentities;
    }


    /**
     * Sets the xmlblockexternalentities value for this Appfwprofile.
     * 
     * @param xmlblockexternalentities
     */
    public void setXmlblockexternalentities(java.lang.String[] xmlblockexternalentities) {
        this.xmlblockexternalentities = xmlblockexternalentities;
    }


    /**
     * Gets the xmlmaxentityexpansionscheck value for this Appfwprofile.
     * 
     * @return xmlmaxentityexpansionscheck
     */
    public java.lang.String[] getXmlmaxentityexpansionscheck() {
        return xmlmaxentityexpansionscheck;
    }


    /**
     * Sets the xmlmaxentityexpansionscheck value for this Appfwprofile.
     * 
     * @param xmlmaxentityexpansionscheck
     */
    public void setXmlmaxentityexpansionscheck(java.lang.String[] xmlmaxentityexpansionscheck) {
        this.xmlmaxentityexpansionscheck = xmlmaxentityexpansionscheck;
    }


    /**
     * Gets the xmlmaxentityexpansions value for this Appfwprofile.
     * 
     * @return xmlmaxentityexpansions
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxentityexpansions() {
        return xmlmaxentityexpansions;
    }


    /**
     * Sets the xmlmaxentityexpansions value for this Appfwprofile.
     * 
     * @param xmlmaxentityexpansions
     */
    public void setXmlmaxentityexpansions(org.apache.axis.types.UnsignedInt[] xmlmaxentityexpansions) {
        this.xmlmaxentityexpansions = xmlmaxentityexpansions;
    }


    /**
     * Gets the xmlmaxentityexpansiondepthcheck value for this Appfwprofile.
     * 
     * @return xmlmaxentityexpansiondepthcheck
     */
    public java.lang.String[] getXmlmaxentityexpansiondepthcheck() {
        return xmlmaxentityexpansiondepthcheck;
    }


    /**
     * Sets the xmlmaxentityexpansiondepthcheck value for this Appfwprofile.
     * 
     * @param xmlmaxentityexpansiondepthcheck
     */
    public void setXmlmaxentityexpansiondepthcheck(java.lang.String[] xmlmaxentityexpansiondepthcheck) {
        this.xmlmaxentityexpansiondepthcheck = xmlmaxentityexpansiondepthcheck;
    }


    /**
     * Gets the xmlmaxentityexpansiondepth value for this Appfwprofile.
     * 
     * @return xmlmaxentityexpansiondepth
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxentityexpansiondepth() {
        return xmlmaxentityexpansiondepth;
    }


    /**
     * Sets the xmlmaxentityexpansiondepth value for this Appfwprofile.
     * 
     * @param xmlmaxentityexpansiondepth
     */
    public void setXmlmaxentityexpansiondepth(org.apache.axis.types.UnsignedInt[] xmlmaxentityexpansiondepth) {
        this.xmlmaxentityexpansiondepth = xmlmaxentityexpansiondepth;
    }


    /**
     * Gets the xmlmaxnamespacescheck value for this Appfwprofile.
     * 
     * @return xmlmaxnamespacescheck
     */
    public java.lang.String[] getXmlmaxnamespacescheck() {
        return xmlmaxnamespacescheck;
    }


    /**
     * Sets the xmlmaxnamespacescheck value for this Appfwprofile.
     * 
     * @param xmlmaxnamespacescheck
     */
    public void setXmlmaxnamespacescheck(java.lang.String[] xmlmaxnamespacescheck) {
        this.xmlmaxnamespacescheck = xmlmaxnamespacescheck;
    }


    /**
     * Gets the xmlmaxnamespaces value for this Appfwprofile.
     * 
     * @return xmlmaxnamespaces
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxnamespaces() {
        return xmlmaxnamespaces;
    }


    /**
     * Sets the xmlmaxnamespaces value for this Appfwprofile.
     * 
     * @param xmlmaxnamespaces
     */
    public void setXmlmaxnamespaces(org.apache.axis.types.UnsignedInt[] xmlmaxnamespaces) {
        this.xmlmaxnamespaces = xmlmaxnamespaces;
    }


    /**
     * Gets the xmlmaxnamespaceurilengthcheck value for this Appfwprofile.
     * 
     * @return xmlmaxnamespaceurilengthcheck
     */
    public java.lang.String[] getXmlmaxnamespaceurilengthcheck() {
        return xmlmaxnamespaceurilengthcheck;
    }


    /**
     * Sets the xmlmaxnamespaceurilengthcheck value for this Appfwprofile.
     * 
     * @param xmlmaxnamespaceurilengthcheck
     */
    public void setXmlmaxnamespaceurilengthcheck(java.lang.String[] xmlmaxnamespaceurilengthcheck) {
        this.xmlmaxnamespaceurilengthcheck = xmlmaxnamespaceurilengthcheck;
    }


    /**
     * Gets the xmlmaxnamespaceurilength value for this Appfwprofile.
     * 
     * @return xmlmaxnamespaceurilength
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxnamespaceurilength() {
        return xmlmaxnamespaceurilength;
    }


    /**
     * Sets the xmlmaxnamespaceurilength value for this Appfwprofile.
     * 
     * @param xmlmaxnamespaceurilength
     */
    public void setXmlmaxnamespaceurilength(org.apache.axis.types.UnsignedInt[] xmlmaxnamespaceurilength) {
        this.xmlmaxnamespaceurilength = xmlmaxnamespaceurilength;
    }


    /**
     * Gets the xmlsoaparraycheck value for this Appfwprofile.
     * 
     * @return xmlsoaparraycheck
     */
    public java.lang.String[] getXmlsoaparraycheck() {
        return xmlsoaparraycheck;
    }


    /**
     * Sets the xmlsoaparraycheck value for this Appfwprofile.
     * 
     * @param xmlsoaparraycheck
     */
    public void setXmlsoaparraycheck(java.lang.String[] xmlsoaparraycheck) {
        this.xmlsoaparraycheck = xmlsoaparraycheck;
    }


    /**
     * Gets the xmlmaxsoaparraysize value for this Appfwprofile.
     * 
     * @return xmlmaxsoaparraysize
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxsoaparraysize() {
        return xmlmaxsoaparraysize;
    }


    /**
     * Sets the xmlmaxsoaparraysize value for this Appfwprofile.
     * 
     * @param xmlmaxsoaparraysize
     */
    public void setXmlmaxsoaparraysize(org.apache.axis.types.UnsignedInt[] xmlmaxsoaparraysize) {
        this.xmlmaxsoaparraysize = xmlmaxsoaparraysize;
    }


    /**
     * Gets the xmlmaxsoaparrayrank value for this Appfwprofile.
     * 
     * @return xmlmaxsoaparrayrank
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxsoaparrayrank() {
        return xmlmaxsoaparrayrank;
    }


    /**
     * Sets the xmlmaxsoaparrayrank value for this Appfwprofile.
     * 
     * @param xmlmaxsoaparrayrank
     */
    public void setXmlmaxsoaparrayrank(org.apache.axis.types.UnsignedInt[] xmlmaxsoaparrayrank) {
        this.xmlmaxsoaparrayrank = xmlmaxsoaparrayrank;
    }


    /**
     * Gets the xmlwsichecks value for this Appfwprofile.
     * 
     * @return xmlwsichecks
     */
    public java.lang.String[] getXmlwsichecks() {
        return xmlwsichecks;
    }


    /**
     * Sets the xmlwsichecks value for this Appfwprofile.
     * 
     * @param xmlwsichecks
     */
    public void setXmlwsichecks(java.lang.String[] xmlwsichecks) {
        this.xmlwsichecks = xmlwsichecks;
    }


    /**
     * Gets the xmlrequestschema value for this Appfwprofile.
     * 
     * @return xmlrequestschema
     */
    public java.lang.String[] getXmlrequestschema() {
        return xmlrequestschema;
    }


    /**
     * Sets the xmlrequestschema value for this Appfwprofile.
     * 
     * @param xmlrequestschema
     */
    public void setXmlrequestschema(java.lang.String[] xmlrequestschema) {
        this.xmlrequestschema = xmlrequestschema;
    }


    /**
     * Gets the xmlresponseschema value for this Appfwprofile.
     * 
     * @return xmlresponseschema
     */
    public java.lang.String[] getXmlresponseschema() {
        return xmlresponseschema;
    }


    /**
     * Sets the xmlresponseschema value for this Appfwprofile.
     * 
     * @param xmlresponseschema
     */
    public void setXmlresponseschema(java.lang.String[] xmlresponseschema) {
        this.xmlresponseschema = xmlresponseschema;
    }


    /**
     * Gets the xmlwsdl value for this Appfwprofile.
     * 
     * @return xmlwsdl
     */
    public java.lang.String[] getXmlwsdl() {
        return xmlwsdl;
    }


    /**
     * Sets the xmlwsdl value for this Appfwprofile.
     * 
     * @param xmlwsdl
     */
    public void setXmlwsdl(java.lang.String[] xmlwsdl) {
        this.xmlwsdl = xmlwsdl;
    }


    /**
     * Gets the xmladditionalsoapheaders value for this Appfwprofile.
     * 
     * @return xmladditionalsoapheaders
     */
    public java.lang.String[] getXmladditionalsoapheaders() {
        return xmladditionalsoapheaders;
    }


    /**
     * Sets the xmladditionalsoapheaders value for this Appfwprofile.
     * 
     * @param xmladditionalsoapheaders
     */
    public void setXmladditionalsoapheaders(java.lang.String[] xmladditionalsoapheaders) {
        this.xmladditionalsoapheaders = xmladditionalsoapheaders;
    }


    /**
     * Gets the xmlendpointcheck value for this Appfwprofile.
     * 
     * @return xmlendpointcheck
     */
    public java.lang.String[] getXmlendpointcheck() {
        return xmlendpointcheck;
    }


    /**
     * Sets the xmlendpointcheck value for this Appfwprofile.
     * 
     * @param xmlendpointcheck
     */
    public void setXmlendpointcheck(java.lang.String[] xmlendpointcheck) {
        this.xmlendpointcheck = xmlendpointcheck;
    }


    /**
     * Gets the xmlvalidatesoapenvelope value for this Appfwprofile.
     * 
     * @return xmlvalidatesoapenvelope
     */
    public java.lang.String[] getXmlvalidatesoapenvelope() {
        return xmlvalidatesoapenvelope;
    }


    /**
     * Sets the xmlvalidatesoapenvelope value for this Appfwprofile.
     * 
     * @param xmlvalidatesoapenvelope
     */
    public void setXmlvalidatesoapenvelope(java.lang.String[] xmlvalidatesoapenvelope) {
        this.xmlvalidatesoapenvelope = xmlvalidatesoapenvelope;
    }


    /**
     * Gets the xmlvalidateresponse value for this Appfwprofile.
     * 
     * @return xmlvalidateresponse
     */
    public java.lang.String[] getXmlvalidateresponse() {
        return xmlvalidateresponse;
    }


    /**
     * Sets the xmlvalidateresponse value for this Appfwprofile.
     * 
     * @param xmlvalidateresponse
     */
    public void setXmlvalidateresponse(java.lang.String[] xmlvalidateresponse) {
        this.xmlvalidateresponse = xmlvalidateresponse;
    }


    /**
     * Gets the xmlmaxattachmentsizecheck value for this Appfwprofile.
     * 
     * @return xmlmaxattachmentsizecheck
     */
    public java.lang.String[] getXmlmaxattachmentsizecheck() {
        return xmlmaxattachmentsizecheck;
    }


    /**
     * Sets the xmlmaxattachmentsizecheck value for this Appfwprofile.
     * 
     * @param xmlmaxattachmentsizecheck
     */
    public void setXmlmaxattachmentsizecheck(java.lang.String[] xmlmaxattachmentsizecheck) {
        this.xmlmaxattachmentsizecheck = xmlmaxattachmentsizecheck;
    }


    /**
     * Gets the xmlmaxattachmentsize value for this Appfwprofile.
     * 
     * @return xmlmaxattachmentsize
     */
    public org.apache.axis.types.UnsignedInt[] getXmlmaxattachmentsize() {
        return xmlmaxattachmentsize;
    }


    /**
     * Sets the xmlmaxattachmentsize value for this Appfwprofile.
     * 
     * @param xmlmaxattachmentsize
     */
    public void setXmlmaxattachmentsize(org.apache.axis.types.UnsignedInt[] xmlmaxattachmentsize) {
        this.xmlmaxattachmentsize = xmlmaxattachmentsize;
    }


    /**
     * Gets the xmlattachmentcontenttypecheck value for this Appfwprofile.
     * 
     * @return xmlattachmentcontenttypecheck
     */
    public java.lang.String[] getXmlattachmentcontenttypecheck() {
        return xmlattachmentcontenttypecheck;
    }


    /**
     * Sets the xmlattachmentcontenttypecheck value for this Appfwprofile.
     * 
     * @param xmlattachmentcontenttypecheck
     */
    public void setXmlattachmentcontenttypecheck(java.lang.String[] xmlattachmentcontenttypecheck) {
        this.xmlattachmentcontenttypecheck = xmlattachmentcontenttypecheck;
    }


    /**
     * Gets the xmlattachmentcontenttype value for this Appfwprofile.
     * 
     * @return xmlattachmentcontenttype
     */
    public java.lang.String[] getXmlattachmentcontenttype() {
        return xmlattachmentcontenttype;
    }


    /**
     * Sets the xmlattachmentcontenttype value for this Appfwprofile.
     * 
     * @param xmlattachmentcontenttype
     */
    public void setXmlattachmentcontenttype(java.lang.String[] xmlattachmentcontenttype) {
        this.xmlattachmentcontenttype = xmlattachmentcontenttype;
    }


    /**
     * Gets the builtin value for this Appfwprofile.
     * 
     * @return builtin
     */
    public boolean isBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Appfwprofile.
     * 
     * @param builtin
     */
    public void setBuiltin(boolean builtin) {
        this.builtin = builtin;
    }


    /**
     * Gets the trustedlearningclients value for this Appfwprofile.
     * 
     * @return trustedlearningclients
     */
    public java.lang.String[] getTrustedlearningclients() {
        return trustedlearningclients;
    }


    /**
     * Sets the trustedlearningclients value for this Appfwprofile.
     * 
     * @param trustedlearningclients
     */
    public void setTrustedlearningclients(java.lang.String[] trustedlearningclients) {
        this.trustedlearningclients = trustedlearningclients;
    }


    /**
     * Gets the contenttype value for this Appfwprofile.
     * 
     * @return contenttype
     */
    public java.lang.String[] getContenttype() {
        return contenttype;
    }


    /**
     * Sets the contenttype value for this Appfwprofile.
     * 
     * @param contenttype
     */
    public void setContenttype(java.lang.String[] contenttype) {
        this.contenttype = contenttype;
    }


    /**
     * Gets the excluderescontenttype value for this Appfwprofile.
     * 
     * @return excluderescontenttype
     */
    public java.lang.String[] getExcluderescontenttype() {
        return excluderescontenttype;
    }


    /**
     * Sets the excluderescontenttype value for this Appfwprofile.
     * 
     * @param excluderescontenttype
     */
    public void setExcluderescontenttype(java.lang.String[] excluderescontenttype) {
        this.excluderescontenttype = excluderescontenttype;
    }


    /**
     * Gets the starturlstate value for this Appfwprofile.
     * 
     * @return starturlstate
     */
    public java.lang.String[] getStarturlstate() {
        return starturlstate;
    }


    /**
     * Sets the starturlstate value for this Appfwprofile.
     * 
     * @param starturlstate
     */
    public void setStarturlstate(java.lang.String[] starturlstate) {
        this.starturlstate = starturlstate;
    }


    /**
     * Gets the starturlcomment value for this Appfwprofile.
     * 
     * @return starturlcomment
     */
    public java.lang.String[] getStarturlcomment() {
        return starturlcomment;
    }


    /**
     * Sets the starturlcomment value for this Appfwprofile.
     * 
     * @param starturlcomment
     */
    public void setStarturlcomment(java.lang.String[] starturlcomment) {
        this.starturlcomment = starturlcomment;
    }


    /**
     * Gets the denyurlstate value for this Appfwprofile.
     * 
     * @return denyurlstate
     */
    public java.lang.String[] getDenyurlstate() {
        return denyurlstate;
    }


    /**
     * Sets the denyurlstate value for this Appfwprofile.
     * 
     * @param denyurlstate
     */
    public void setDenyurlstate(java.lang.String[] denyurlstate) {
        this.denyurlstate = denyurlstate;
    }


    /**
     * Gets the denyurlcomment value for this Appfwprofile.
     * 
     * @return denyurlcomment
     */
    public java.lang.String[] getDenyurlcomment() {
        return denyurlcomment;
    }


    /**
     * Sets the denyurlcomment value for this Appfwprofile.
     * 
     * @param denyurlcomment
     */
    public void setDenyurlcomment(java.lang.String[] denyurlcomment) {
        this.denyurlcomment = denyurlcomment;
    }


    /**
     * Gets the fieldconsistencystate value for this Appfwprofile.
     * 
     * @return fieldconsistencystate
     */
    public java.lang.String[] getFieldconsistencystate() {
        return fieldconsistencystate;
    }


    /**
     * Sets the fieldconsistencystate value for this Appfwprofile.
     * 
     * @param fieldconsistencystate
     */
    public void setFieldconsistencystate(java.lang.String[] fieldconsistencystate) {
        this.fieldconsistencystate = fieldconsistencystate;
    }


    /**
     * Gets the fieldconsistencycomment value for this Appfwprofile.
     * 
     * @return fieldconsistencycomment
     */
    public java.lang.String[] getFieldconsistencycomment() {
        return fieldconsistencycomment;
    }


    /**
     * Sets the fieldconsistencycomment value for this Appfwprofile.
     * 
     * @param fieldconsistencycomment
     */
    public void setFieldconsistencycomment(java.lang.String[] fieldconsistencycomment) {
        this.fieldconsistencycomment = fieldconsistencycomment;
    }


    /**
     * Gets the cookieconsistencystate value for this Appfwprofile.
     * 
     * @return cookieconsistencystate
     */
    public java.lang.String[] getCookieconsistencystate() {
        return cookieconsistencystate;
    }


    /**
     * Sets the cookieconsistencystate value for this Appfwprofile.
     * 
     * @param cookieconsistencystate
     */
    public void setCookieconsistencystate(java.lang.String[] cookieconsistencystate) {
        this.cookieconsistencystate = cookieconsistencystate;
    }


    /**
     * Gets the cookieconsistencycomment value for this Appfwprofile.
     * 
     * @return cookieconsistencycomment
     */
    public java.lang.String[] getCookieconsistencycomment() {
        return cookieconsistencycomment;
    }


    /**
     * Sets the cookieconsistencycomment value for this Appfwprofile.
     * 
     * @param cookieconsistencycomment
     */
    public void setCookieconsistencycomment(java.lang.String[] cookieconsistencycomment) {
        this.cookieconsistencycomment = cookieconsistencycomment;
    }


    /**
     * Gets the csrfformoriginurl value for this Appfwprofile.
     * 
     * @return csrfformoriginurl
     */
    public java.lang.String[] getCsrfformoriginurl() {
        return csrfformoriginurl;
    }


    /**
     * Sets the csrfformoriginurl value for this Appfwprofile.
     * 
     * @param csrfformoriginurl
     */
    public void setCsrfformoriginurl(java.lang.String[] csrfformoriginurl) {
        this.csrfformoriginurl = csrfformoriginurl;
    }


    /**
     * Gets the csrftagstate value for this Appfwprofile.
     * 
     * @return csrftagstate
     */
    public java.lang.String[] getCsrftagstate() {
        return csrftagstate;
    }


    /**
     * Sets the csrftagstate value for this Appfwprofile.
     * 
     * @param csrftagstate
     */
    public void setCsrftagstate(java.lang.String[] csrftagstate) {
        this.csrftagstate = csrftagstate;
    }


    /**
     * Gets the csrftagcomment value for this Appfwprofile.
     * 
     * @return csrftagcomment
     */
    public java.lang.String[] getCsrftagcomment() {
        return csrftagcomment;
    }


    /**
     * Sets the csrftagcomment value for this Appfwprofile.
     * 
     * @param csrftagcomment
     */
    public void setCsrftagcomment(java.lang.String[] csrftagcomment) {
        this.csrftagcomment = csrftagcomment;
    }


    /**
     * Gets the crosssitescriptingstate value for this Appfwprofile.
     * 
     * @return crosssitescriptingstate
     */
    public java.lang.String[] getCrosssitescriptingstate() {
        return crosssitescriptingstate;
    }


    /**
     * Sets the crosssitescriptingstate value for this Appfwprofile.
     * 
     * @param crosssitescriptingstate
     */
    public void setCrosssitescriptingstate(java.lang.String[] crosssitescriptingstate) {
        this.crosssitescriptingstate = crosssitescriptingstate;
    }


    /**
     * Gets the crosssitescriptingcomment value for this Appfwprofile.
     * 
     * @return crosssitescriptingcomment
     */
    public java.lang.String[] getCrosssitescriptingcomment() {
        return crosssitescriptingcomment;
    }


    /**
     * Sets the crosssitescriptingcomment value for this Appfwprofile.
     * 
     * @param crosssitescriptingcomment
     */
    public void setCrosssitescriptingcomment(java.lang.String[] crosssitescriptingcomment) {
        this.crosssitescriptingcomment = crosssitescriptingcomment;
    }


    /**
     * Gets the sqlinjectionstate value for this Appfwprofile.
     * 
     * @return sqlinjectionstate
     */
    public java.lang.String[] getSqlinjectionstate() {
        return sqlinjectionstate;
    }


    /**
     * Sets the sqlinjectionstate value for this Appfwprofile.
     * 
     * @param sqlinjectionstate
     */
    public void setSqlinjectionstate(java.lang.String[] sqlinjectionstate) {
        this.sqlinjectionstate = sqlinjectionstate;
    }


    /**
     * Gets the sqlinjectioncomment value for this Appfwprofile.
     * 
     * @return sqlinjectioncomment
     */
    public java.lang.String[] getSqlinjectioncomment() {
        return sqlinjectioncomment;
    }


    /**
     * Sets the sqlinjectioncomment value for this Appfwprofile.
     * 
     * @param sqlinjectioncomment
     */
    public void setSqlinjectioncomment(java.lang.String[] sqlinjectioncomment) {
        this.sqlinjectioncomment = sqlinjectioncomment;
    }


    /**
     * Gets the fieldformatstate value for this Appfwprofile.
     * 
     * @return fieldformatstate
     */
    public java.lang.String[] getFieldformatstate() {
        return fieldformatstate;
    }


    /**
     * Sets the fieldformatstate value for this Appfwprofile.
     * 
     * @param fieldformatstate
     */
    public void setFieldformatstate(java.lang.String[] fieldformatstate) {
        this.fieldformatstate = fieldformatstate;
    }


    /**
     * Gets the fieldformatcomment value for this Appfwprofile.
     * 
     * @return fieldformatcomment
     */
    public java.lang.String[] getFieldformatcomment() {
        return fieldformatcomment;
    }


    /**
     * Sets the fieldformatcomment value for this Appfwprofile.
     * 
     * @param fieldformatcomment
     */
    public void setFieldformatcomment(java.lang.String[] fieldformatcomment) {
        this.fieldformatcomment = fieldformatcomment;
    }


    /**
     * Gets the safeobjectstate value for this Appfwprofile.
     * 
     * @return safeobjectstate
     */
    public java.lang.String[] getSafeobjectstate() {
        return safeobjectstate;
    }


    /**
     * Sets the safeobjectstate value for this Appfwprofile.
     * 
     * @param safeobjectstate
     */
    public void setSafeobjectstate(java.lang.String[] safeobjectstate) {
        this.safeobjectstate = safeobjectstate;
    }


    /**
     * Gets the safeobjectcomment value for this Appfwprofile.
     * 
     * @return safeobjectcomment
     */
    public java.lang.String[] getSafeobjectcomment() {
        return safeobjectcomment;
    }


    /**
     * Sets the safeobjectcomment value for this Appfwprofile.
     * 
     * @param safeobjectcomment
     */
    public void setSafeobjectcomment(java.lang.String[] safeobjectcomment) {
        this.safeobjectcomment = safeobjectcomment;
    }


    /**
     * Gets the trustedlearningstate value for this Appfwprofile.
     * 
     * @return trustedlearningstate
     */
    public java.lang.String[] getTrustedlearningstate() {
        return trustedlearningstate;
    }


    /**
     * Sets the trustedlearningstate value for this Appfwprofile.
     * 
     * @param trustedlearningstate
     */
    public void setTrustedlearningstate(java.lang.String[] trustedlearningstate) {
        this.trustedlearningstate = trustedlearningstate;
    }


    /**
     * Gets the trustedlearningcomment value for this Appfwprofile.
     * 
     * @return trustedlearningcomment
     */
    public java.lang.String[] getTrustedlearningcomment() {
        return trustedlearningcomment;
    }


    /**
     * Sets the trustedlearningcomment value for this Appfwprofile.
     * 
     * @param trustedlearningcomment
     */
    public void setTrustedlearningcomment(java.lang.String[] trustedlearningcomment) {
        this.trustedlearningcomment = trustedlearningcomment;
    }


    /**
     * Gets the xmldosstate value for this Appfwprofile.
     * 
     * @return xmldosstate
     */
    public java.lang.String[] getXmldosstate() {
        return xmldosstate;
    }


    /**
     * Sets the xmldosstate value for this Appfwprofile.
     * 
     * @param xmldosstate
     */
    public void setXmldosstate(java.lang.String[] xmldosstate) {
        this.xmldosstate = xmldosstate;
    }


    /**
     * Gets the xmldoscomment value for this Appfwprofile.
     * 
     * @return xmldoscomment
     */
    public java.lang.String[] getXmldoscomment() {
        return xmldoscomment;
    }


    /**
     * Sets the xmldoscomment value for this Appfwprofile.
     * 
     * @param xmldoscomment
     */
    public void setXmldoscomment(java.lang.String[] xmldoscomment) {
        this.xmldoscomment = xmldoscomment;
    }


    /**
     * Gets the xmlwsistate value for this Appfwprofile.
     * 
     * @return xmlwsistate
     */
    public java.lang.String[] getXmlwsistate() {
        return xmlwsistate;
    }


    /**
     * Sets the xmlwsistate value for this Appfwprofile.
     * 
     * @param xmlwsistate
     */
    public void setXmlwsistate(java.lang.String[] xmlwsistate) {
        this.xmlwsistate = xmlwsistate;
    }


    /**
     * Gets the xmlwsicomment value for this Appfwprofile.
     * 
     * @return xmlwsicomment
     */
    public java.lang.String[] getXmlwsicomment() {
        return xmlwsicomment;
    }


    /**
     * Sets the xmlwsicomment value for this Appfwprofile.
     * 
     * @param xmlwsicomment
     */
    public void setXmlwsicomment(java.lang.String[] xmlwsicomment) {
        this.xmlwsicomment = xmlwsicomment;
    }


    /**
     * Gets the xmlvalidationstate value for this Appfwprofile.
     * 
     * @return xmlvalidationstate
     */
    public java.lang.String[] getXmlvalidationstate() {
        return xmlvalidationstate;
    }


    /**
     * Sets the xmlvalidationstate value for this Appfwprofile.
     * 
     * @param xmlvalidationstate
     */
    public void setXmlvalidationstate(java.lang.String[] xmlvalidationstate) {
        this.xmlvalidationstate = xmlvalidationstate;
    }


    /**
     * Gets the xmlvalidationcomment value for this Appfwprofile.
     * 
     * @return xmlvalidationcomment
     */
    public java.lang.String[] getXmlvalidationcomment() {
        return xmlvalidationcomment;
    }


    /**
     * Sets the xmlvalidationcomment value for this Appfwprofile.
     * 
     * @param xmlvalidationcomment
     */
    public void setXmlvalidationcomment(java.lang.String[] xmlvalidationcomment) {
        this.xmlvalidationcomment = xmlvalidationcomment;
    }


    /**
     * Gets the xmlattachmentstate value for this Appfwprofile.
     * 
     * @return xmlattachmentstate
     */
    public java.lang.String[] getXmlattachmentstate() {
        return xmlattachmentstate;
    }


    /**
     * Sets the xmlattachmentstate value for this Appfwprofile.
     * 
     * @param xmlattachmentstate
     */
    public void setXmlattachmentstate(java.lang.String[] xmlattachmentstate) {
        this.xmlattachmentstate = xmlattachmentstate;
    }


    /**
     * Gets the xmlattachmentcomment value for this Appfwprofile.
     * 
     * @return xmlattachmentcomment
     */
    public java.lang.String[] getXmlattachmentcomment() {
        return xmlattachmentcomment;
    }


    /**
     * Sets the xmlattachmentcomment value for this Appfwprofile.
     * 
     * @param xmlattachmentcomment
     */
    public void setXmlattachmentcomment(java.lang.String[] xmlattachmentcomment) {
        this.xmlattachmentcomment = xmlattachmentcomment;
    }


    /**
     * Gets the xmlsqlinjectionstate value for this Appfwprofile.
     * 
     * @return xmlsqlinjectionstate
     */
    public java.lang.String[] getXmlsqlinjectionstate() {
        return xmlsqlinjectionstate;
    }


    /**
     * Sets the xmlsqlinjectionstate value for this Appfwprofile.
     * 
     * @param xmlsqlinjectionstate
     */
    public void setXmlsqlinjectionstate(java.lang.String[] xmlsqlinjectionstate) {
        this.xmlsqlinjectionstate = xmlsqlinjectionstate;
    }


    /**
     * Gets the xmlsqlinjectioncomment value for this Appfwprofile.
     * 
     * @return xmlsqlinjectioncomment
     */
    public java.lang.String[] getXmlsqlinjectioncomment() {
        return xmlsqlinjectioncomment;
    }


    /**
     * Sets the xmlsqlinjectioncomment value for this Appfwprofile.
     * 
     * @param xmlsqlinjectioncomment
     */
    public void setXmlsqlinjectioncomment(java.lang.String[] xmlsqlinjectioncomment) {
        this.xmlsqlinjectioncomment = xmlsqlinjectioncomment;
    }


    /**
     * Gets the xmlxssstate value for this Appfwprofile.
     * 
     * @return xmlxssstate
     */
    public java.lang.String[] getXmlxssstate() {
        return xmlxssstate;
    }


    /**
     * Sets the xmlxssstate value for this Appfwprofile.
     * 
     * @param xmlxssstate
     */
    public void setXmlxssstate(java.lang.String[] xmlxssstate) {
        this.xmlxssstate = xmlxssstate;
    }


    /**
     * Gets the xmlxsscomment value for this Appfwprofile.
     * 
     * @return xmlxsscomment
     */
    public java.lang.String[] getXmlxsscomment() {
        return xmlxsscomment;
    }


    /**
     * Sets the xmlxsscomment value for this Appfwprofile.
     * 
     * @param xmlxsscomment
     */
    public void setXmlxsscomment(java.lang.String[] xmlxsscomment) {
        this.xmlxsscomment = xmlxsscomment;
    }


    /**
     * Gets the contenttypestate value for this Appfwprofile.
     * 
     * @return contenttypestate
     */
    public java.lang.String[] getContenttypestate() {
        return contenttypestate;
    }


    /**
     * Sets the contenttypestate value for this Appfwprofile.
     * 
     * @param contenttypestate
     */
    public void setContenttypestate(java.lang.String[] contenttypestate) {
        this.contenttypestate = contenttypestate;
    }


    /**
     * Gets the contenttypecomment value for this Appfwprofile.
     * 
     * @return contenttypecomment
     */
    public java.lang.String[] getContenttypecomment() {
        return contenttypecomment;
    }


    /**
     * Sets the contenttypecomment value for this Appfwprofile.
     * 
     * @param contenttypecomment
     */
    public void setContenttypecomment(java.lang.String[] contenttypecomment) {
        this.contenttypecomment = contenttypecomment;
    }


    /**
     * Gets the excluderescontenttypestate value for this Appfwprofile.
     * 
     * @return excluderescontenttypestate
     */
    public java.lang.String[] getExcluderescontenttypestate() {
        return excluderescontenttypestate;
    }


    /**
     * Sets the excluderescontenttypestate value for this Appfwprofile.
     * 
     * @param excluderescontenttypestate
     */
    public void setExcluderescontenttypestate(java.lang.String[] excluderescontenttypestate) {
        this.excluderescontenttypestate = excluderescontenttypestate;
    }


    /**
     * Gets the excluderescontenttypestatecomment value for this Appfwprofile.
     * 
     * @return excluderescontenttypestatecomment
     */
    public java.lang.String[] getExcluderescontenttypestatecomment() {
        return excluderescontenttypestatecomment;
    }


    /**
     * Sets the excluderescontenttypestatecomment value for this Appfwprofile.
     * 
     * @param excluderescontenttypestatecomment
     */
    public void setExcluderescontenttypestatecomment(java.lang.String[] excluderescontenttypestatecomment) {
        this.excluderescontenttypestatecomment = excluderescontenttypestatecomment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appfwprofile)) return false;
        Appfwprofile other = (Appfwprofile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.defaults==null && other.getDefaults()==null) || 
             (this.defaults!=null &&
              this.defaults.equals(other.getDefaults()))) &&
            ((this.usehtmlerrorobject==null && other.getUsehtmlerrorobject()==null) || 
             (this.usehtmlerrorobject!=null &&
              this.usehtmlerrorobject.equals(other.getUsehtmlerrorobject()))) &&
            ((this.errorurl==null && other.getErrorurl()==null) || 
             (this.errorurl!=null &&
              this.errorurl.equals(other.getErrorurl()))) &&
            ((this.htmlerrorobject==null && other.getHtmlerrorobject()==null) || 
             (this.htmlerrorobject!=null &&
              this.htmlerrorobject.equals(other.getHtmlerrorobject()))) &&
            ((this.logeverypolicyhit==null && other.getLogeverypolicyhit()==null) || 
             (this.logeverypolicyhit!=null &&
              this.logeverypolicyhit.equals(other.getLogeverypolicyhit()))) &&
            ((this.stripcomments==null && other.getStripcomments()==null) || 
             (this.stripcomments!=null &&
              this.stripcomments.equals(other.getStripcomments()))) &&
            ((this.striphtmlcomments==null && other.getStriphtmlcomments()==null) || 
             (this.striphtmlcomments!=null &&
              this.striphtmlcomments.equals(other.getStriphtmlcomments()))) &&
            ((this.stripxmlcomments==null && other.getStripxmlcomments()==null) || 
             (this.stripxmlcomments!=null &&
              this.stripxmlcomments.equals(other.getStripxmlcomments()))) &&
            ((this.defaultcharset==null && other.getDefaultcharset()==null) || 
             (this.defaultcharset!=null &&
              this.defaultcharset.equals(other.getDefaultcharset()))) &&
            ((this.postbodylimit==null && other.getPostbodylimit()==null) || 
             (this.postbodylimit!=null &&
              this.postbodylimit.equals(other.getPostbodylimit()))) &&
            ((this.fileuploadmaxnum==null && other.getFileuploadmaxnum()==null) || 
             (this.fileuploadmaxnum!=null &&
              this.fileuploadmaxnum.equals(other.getFileuploadmaxnum()))) &&
            ((this.canonicalizehtmlresponse==null && other.getCanonicalizehtmlresponse()==null) || 
             (this.canonicalizehtmlresponse!=null &&
              this.canonicalizehtmlresponse.equals(other.getCanonicalizehtmlresponse()))) &&
            ((this.enableformtagging==null && other.getEnableformtagging()==null) || 
             (this.enableformtagging!=null &&
              this.enableformtagging.equals(other.getEnableformtagging()))) &&
            ((this.sessionlessfieldconsistency==null && other.getSessionlessfieldconsistency()==null) || 
             (this.sessionlessfieldconsistency!=null &&
              this.sessionlessfieldconsistency.equals(other.getSessionlessfieldconsistency()))) &&
            ((this.sessionlessurlclosure==null && other.getSessionlessurlclosure()==null) || 
             (this.sessionlessurlclosure!=null &&
              this.sessionlessurlclosure.equals(other.getSessionlessurlclosure()))) &&
            ((this.semicolonfieldseparator==null && other.getSemicolonfieldseparator()==null) || 
             (this.semicolonfieldseparator!=null &&
              this.semicolonfieldseparator.equals(other.getSemicolonfieldseparator()))) &&
            ((this.excludefileuploadfromchecks==null && other.getExcludefileuploadfromchecks()==null) || 
             (this.excludefileuploadfromchecks!=null &&
              this.excludefileuploadfromchecks.equals(other.getExcludefileuploadfromchecks()))) &&
            ((this.sqlinjectionparsecomments==null && other.getSqlinjectionparsecomments()==null) || 
             (this.sqlinjectionparsecomments!=null &&
              this.sqlinjectionparsecomments.equals(other.getSqlinjectionparsecomments()))) &&
            ((this.checkrequestheaders==null && other.getCheckrequestheaders()==null) || 
             (this.checkrequestheaders!=null &&
              this.checkrequestheaders.equals(other.getCheckrequestheaders()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.starturlaction==null && other.getStarturlaction()==null) || 
             (this.starturlaction!=null &&
              this.starturlaction.equals(other.getStarturlaction()))) &&
            ((this.starturl==null && other.getStarturl()==null) || 
             (this.starturl!=null &&
              java.util.Arrays.equals(this.starturl, other.getStarturl()))) &&
            ((this.starturlclosure==null && other.getStarturlclosure()==null) || 
             (this.starturlclosure!=null &&
              this.starturlclosure.equals(other.getStarturlclosure()))) &&
            ((this.denyurlaction==null && other.getDenyurlaction()==null) || 
             (this.denyurlaction!=null &&
              this.denyurlaction.equals(other.getDenyurlaction()))) &&
            ((this.denyurl==null && other.getDenyurl()==null) || 
             (this.denyurl!=null &&
              java.util.Arrays.equals(this.denyurl, other.getDenyurl()))) &&
            ((this.refererheadercheck==null && other.getRefererheadercheck()==null) || 
             (this.refererheadercheck!=null &&
              this.refererheadercheck.equals(other.getRefererheadercheck()))) &&
            ((this.csrftagaction==null && other.getCsrftagaction()==null) || 
             (this.csrftagaction!=null &&
              this.csrftagaction.equals(other.getCsrftagaction()))) &&
            ((this.csrftag==null && other.getCsrftag()==null) || 
             (this.csrftag!=null &&
              this.csrftag.equals(other.getCsrftag()))) &&
            ((this.csrfformactionurl==null && other.getCsrfformactionurl()==null) || 
             (this.csrfformactionurl!=null &&
              java.util.Arrays.equals(this.csrfformactionurl, other.getCsrfformactionurl()))) &&
            ((this.crosssitescriptingaction==null && other.getCrosssitescriptingaction()==null) || 
             (this.crosssitescriptingaction!=null &&
              this.crosssitescriptingaction.equals(other.getCrosssitescriptingaction()))) &&
            ((this.crosssitescriptingtransformunsafehtml==null && other.getCrosssitescriptingtransformunsafehtml()==null) || 
             (this.crosssitescriptingtransformunsafehtml!=null &&
              this.crosssitescriptingtransformunsafehtml.equals(other.getCrosssitescriptingtransformunsafehtml()))) &&
            ((this.crosssitescriptingcheckcompleteurls==null && other.getCrosssitescriptingcheckcompleteurls()==null) || 
             (this.crosssitescriptingcheckcompleteurls!=null &&
              this.crosssitescriptingcheckcompleteurls.equals(other.getCrosssitescriptingcheckcompleteurls()))) &&
            ((this.crosssitescripting==null && other.getCrosssitescripting()==null) || 
             (this.crosssitescripting!=null &&
              java.util.Arrays.equals(this.crosssitescripting, other.getCrosssitescripting()))) &&
            ((this.isregex==null && other.getIsregex()==null) || 
             (this.isregex!=null &&
              java.util.Arrays.equals(this.isregex, other.getIsregex()))) &&
            ((this.formactionurl==null && other.getFormactionurl()==null) || 
             (this.formactionurl!=null &&
              java.util.Arrays.equals(this.formactionurl, other.getFormactionurl()))) &&
            ((this.exemptclosureurlsfromsecuritychecks==null && other.getExemptclosureurlsfromsecuritychecks()==null) || 
             (this.exemptclosureurlsfromsecuritychecks!=null &&
              this.exemptclosureurlsfromsecuritychecks.equals(other.getExemptclosureurlsfromsecuritychecks()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.sqlinjectionaction==null && other.getSqlinjectionaction()==null) || 
             (this.sqlinjectionaction!=null &&
              this.sqlinjectionaction.equals(other.getSqlinjectionaction()))) &&
            ((this.sqlinjectiontransformspecialchars==null && other.getSqlinjectiontransformspecialchars()==null) || 
             (this.sqlinjectiontransformspecialchars!=null &&
              this.sqlinjectiontransformspecialchars.equals(other.getSqlinjectiontransformspecialchars()))) &&
            ((this.sqlinjectiononlycheckfieldswithsqlchars==null && other.getSqlinjectiononlycheckfieldswithsqlchars()==null) || 
             (this.sqlinjectiononlycheckfieldswithsqlchars!=null &&
              this.sqlinjectiononlycheckfieldswithsqlchars.equals(other.getSqlinjectiononlycheckfieldswithsqlchars()))) &&
            ((this.sqlinjectionchecksqlwildchars==null && other.getSqlinjectionchecksqlwildchars()==null) || 
             (this.sqlinjectionchecksqlwildchars!=null &&
              this.sqlinjectionchecksqlwildchars.equals(other.getSqlinjectionchecksqlwildchars()))) &&
            ((this.sqlinjection==null && other.getSqlinjection()==null) || 
             (this.sqlinjection!=null &&
              java.util.Arrays.equals(this.sqlinjection, other.getSqlinjection()))) &&
            ((this.isregex2==null && other.getIsregex2()==null) || 
             (this.isregex2!=null &&
              java.util.Arrays.equals(this.isregex2, other.getIsregex2()))) &&
            ((this.formactionurl2==null && other.getFormactionurl2()==null) || 
             (this.formactionurl2!=null &&
              java.util.Arrays.equals(this.formactionurl2, other.getFormactionurl2()))) &&
            ((this.invalidpercenthandling==null && other.getInvalidpercenthandling()==null) || 
             (this.invalidpercenthandling!=null &&
              this.invalidpercenthandling.equals(other.getInvalidpercenthandling()))) &&
            ((this.location2==null && other.getLocation2()==null) || 
             (this.location2!=null &&
              java.util.Arrays.equals(this.location2, other.getLocation2()))) &&
            ((this.fieldconsistencyaction==null && other.getFieldconsistencyaction()==null) || 
             (this.fieldconsistencyaction!=null &&
              this.fieldconsistencyaction.equals(other.getFieldconsistencyaction()))) &&
            ((this.fieldconsistency==null && other.getFieldconsistency()==null) || 
             (this.fieldconsistency!=null &&
              java.util.Arrays.equals(this.fieldconsistency, other.getFieldconsistency()))) &&
            ((this.isregex3==null && other.getIsregex3()==null) || 
             (this.isregex3!=null &&
              java.util.Arrays.equals(this.isregex3, other.getIsregex3()))) &&
            ((this.formactionurl3==null && other.getFormactionurl3()==null) || 
             (this.formactionurl3!=null &&
              java.util.Arrays.equals(this.formactionurl3, other.getFormactionurl3()))) &&
            ((this.cookieconsistencyaction==null && other.getCookieconsistencyaction()==null) || 
             (this.cookieconsistencyaction!=null &&
              this.cookieconsistencyaction.equals(other.getCookieconsistencyaction()))) &&
            ((this.cookieconsistency==null && other.getCookieconsistency()==null) || 
             (this.cookieconsistency!=null &&
              java.util.Arrays.equals(this.cookieconsistency, other.getCookieconsistency()))) &&
            ((this.isregex4==null && other.getIsregex4()==null) || 
             (this.isregex4!=null &&
              java.util.Arrays.equals(this.isregex4, other.getIsregex4()))) &&
            ((this.cookietransforms==null && other.getCookietransforms()==null) || 
             (this.cookietransforms!=null &&
              this.cookietransforms.equals(other.getCookietransforms()))) &&
            ((this.cookieencryption==null && other.getCookieencryption()==null) || 
             (this.cookieencryption!=null &&
              this.cookieencryption.equals(other.getCookieencryption()))) &&
            ((this.cookieproxying==null && other.getCookieproxying()==null) || 
             (this.cookieproxying!=null &&
              this.cookieproxying.equals(other.getCookieproxying()))) &&
            ((this.addcookieflags==null && other.getAddcookieflags()==null) || 
             (this.addcookieflags!=null &&
              this.addcookieflags.equals(other.getAddcookieflags()))) &&
            ((this.bufferoverflowaction==null && other.getBufferoverflowaction()==null) || 
             (this.bufferoverflowaction!=null &&
              this.bufferoverflowaction.equals(other.getBufferoverflowaction()))) &&
            ((this.bufferoverflowmaxurllength==null && other.getBufferoverflowmaxurllength()==null) || 
             (this.bufferoverflowmaxurllength!=null &&
              this.bufferoverflowmaxurllength.equals(other.getBufferoverflowmaxurllength()))) &&
            ((this.bufferoverflowmaxheaderlength==null && other.getBufferoverflowmaxheaderlength()==null) || 
             (this.bufferoverflowmaxheaderlength!=null &&
              this.bufferoverflowmaxheaderlength.equals(other.getBufferoverflowmaxheaderlength()))) &&
            ((this.bufferoverflowmaxcookielength==null && other.getBufferoverflowmaxcookielength()==null) || 
             (this.bufferoverflowmaxcookielength!=null &&
              this.bufferoverflowmaxcookielength.equals(other.getBufferoverflowmaxcookielength()))) &&
            ((this.fieldformataction==null && other.getFieldformataction()==null) || 
             (this.fieldformataction!=null &&
              this.fieldformataction.equals(other.getFieldformataction()))) &&
            ((this.defaultfieldformattype==null && other.getDefaultfieldformattype()==null) || 
             (this.defaultfieldformattype!=null &&
              this.defaultfieldformattype.equals(other.getDefaultfieldformattype()))) &&
            ((this.defaultfieldformatminlength==null && other.getDefaultfieldformatminlength()==null) || 
             (this.defaultfieldformatminlength!=null &&
              this.defaultfieldformatminlength.equals(other.getDefaultfieldformatminlength()))) &&
            ((this.defaultfieldformatmaxlength==null && other.getDefaultfieldformatmaxlength()==null) || 
             (this.defaultfieldformatmaxlength!=null &&
              this.defaultfieldformatmaxlength.equals(other.getDefaultfieldformatmaxlength()))) &&
            ((this.fieldformat==null && other.getFieldformat()==null) || 
             (this.fieldformat!=null &&
              java.util.Arrays.equals(this.fieldformat, other.getFieldformat()))) &&
            ((this.isregex5==null && other.getIsregex5()==null) || 
             (this.isregex5!=null &&
              java.util.Arrays.equals(this.isregex5, other.getIsregex5()))) &&
            ((this.formactionurl4==null && other.getFormactionurl4()==null) || 
             (this.formactionurl4!=null &&
              java.util.Arrays.equals(this.formactionurl4, other.getFormactionurl4()))) &&
            ((this.fieldtype==null && other.getFieldtype()==null) || 
             (this.fieldtype!=null &&
              java.util.Arrays.equals(this.fieldtype, other.getFieldtype()))) &&
            ((this.fieldformatminlength==null && other.getFieldformatminlength()==null) || 
             (this.fieldformatminlength!=null &&
              java.util.Arrays.equals(this.fieldformatminlength, other.getFieldformatminlength()))) &&
            ((this.fieldformatmaxlength==null && other.getFieldformatmaxlength()==null) || 
             (this.fieldformatmaxlength!=null &&
              java.util.Arrays.equals(this.fieldformatmaxlength, other.getFieldformatmaxlength()))) &&
            ((this.creditcardaction==null && other.getCreditcardaction()==null) || 
             (this.creditcardaction!=null &&
              this.creditcardaction.equals(other.getCreditcardaction()))) &&
            ((this.creditcard==null && other.getCreditcard()==null) || 
             (this.creditcard!=null &&
              this.creditcard.equals(other.getCreditcard()))) &&
            ((this.creditcardmaxallowed==null && other.getCreditcardmaxallowed()==null) || 
             (this.creditcardmaxallowed!=null &&
              this.creditcardmaxallowed.equals(other.getCreditcardmaxallowed()))) &&
            ((this.creditcardxout==null && other.getCreditcardxout()==null) || 
             (this.creditcardxout!=null &&
              this.creditcardxout.equals(other.getCreditcardxout()))) &&
            ((this.safeobject==null && other.getSafeobject()==null) || 
             (this.safeobject!=null &&
              java.util.Arrays.equals(this.safeobject, other.getSafeobject()))) &&
            ((this.expression==null && other.getExpression()==null) || 
             (this.expression!=null &&
              java.util.Arrays.equals(this.expression, other.getExpression()))) &&
            ((this.maxmatchlength==null && other.getMaxmatchlength()==null) || 
             (this.maxmatchlength!=null &&
              java.util.Arrays.equals(this.maxmatchlength, other.getMaxmatchlength()))) &&
            ((this.actioN==null && other.getActioN()==null) || 
             (this.actioN!=null &&
              java.util.Arrays.equals(this.actioN, other.getActioN()))) &&
            ((this.requestcontenttype==null && other.getRequestcontenttype()==null) || 
             (this.requestcontenttype!=null &&
              this.requestcontenttype.equals(other.getRequestcontenttype()))) &&
            ((this.responsecontenttype==null && other.getResponsecontenttype()==null) || 
             (this.responsecontenttype!=null &&
              this.responsecontenttype.equals(other.getResponsecontenttype()))) &&
            ((this.xmlerrorobject==null && other.getXmlerrorobject()==null) || 
             (this.xmlerrorobject!=null &&
              this.xmlerrorobject.equals(other.getXmlerrorobject()))) &&
            ((this.signatures==null && other.getSignatures()==null) || 
             (this.signatures!=null &&
              this.signatures.equals(other.getSignatures()))) &&
            ((this._xmlformataction==null && other.get_xmlformataction()==null) || 
             (this._xmlformataction!=null &&
              this._xmlformataction.equals(other.get_xmlformataction()))) &&
            ((this._xmldosaction==null && other.get_xmldosaction()==null) || 
             (this._xmldosaction!=null &&
              this._xmldosaction.equals(other.get_xmldosaction()))) &&
            ((this._xmlsqlinjectionaction==null && other.get_xmlsqlinjectionaction()==null) || 
             (this._xmlsqlinjectionaction!=null &&
              this._xmlsqlinjectionaction.equals(other.get_xmlsqlinjectionaction()))) &&
            ((this.xmlsqlinjectiononlycheckfieldswithsqlchars==null && other.getXmlsqlinjectiononlycheckfieldswithsqlchars()==null) || 
             (this.xmlsqlinjectiononlycheckfieldswithsqlchars!=null &&
              this.xmlsqlinjectiononlycheckfieldswithsqlchars.equals(other.getXmlsqlinjectiononlycheckfieldswithsqlchars()))) &&
            ((this.xmlsqlinjectionchecksqlwildchars==null && other.getXmlsqlinjectionchecksqlwildchars()==null) || 
             (this.xmlsqlinjectionchecksqlwildchars!=null &&
              this.xmlsqlinjectionchecksqlwildchars.equals(other.getXmlsqlinjectionchecksqlwildchars()))) &&
            ((this.xmlsqlinjectionparsecomments==null && other.getXmlsqlinjectionparsecomments()==null) || 
             (this.xmlsqlinjectionparsecomments!=null &&
              this.xmlsqlinjectionparsecomments.equals(other.getXmlsqlinjectionparsecomments()))) &&
            ((this._xmlxssaction==null && other.get_xmlxssaction()==null) || 
             (this._xmlxssaction!=null &&
              this._xmlxssaction.equals(other.get_xmlxssaction()))) &&
            ((this._xmlwsiaction==null && other.get_xmlwsiaction()==null) || 
             (this._xmlwsiaction!=null &&
              this._xmlwsiaction.equals(other.get_xmlwsiaction()))) &&
            ((this._xmlattachmentaction==null && other.get_xmlattachmentaction()==null) || 
             (this._xmlattachmentaction!=null &&
              this._xmlattachmentaction.equals(other.get_xmlattachmentaction()))) &&
            ((this._xmlvalidationaction==null && other.get_xmlvalidationaction()==null) || 
             (this._xmlvalidationaction!=null &&
              this._xmlvalidationaction.equals(other.get_xmlvalidationaction()))) &&
            ((this.xmlsoapfaultaction==null && other.getXmlsoapfaultaction()==null) || 
             (this.xmlsoapfaultaction!=null &&
              this.xmlsoapfaultaction.equals(other.getXmlsoapfaultaction()))) &&
            ((this.xmldosurl==null && other.getXmldosurl()==null) || 
             (this.xmldosurl!=null &&
              java.util.Arrays.equals(this.xmldosurl, other.getXmldosurl()))) &&
            ((this.xmlwsiurl==null && other.getXmlwsiurl()==null) || 
             (this.xmlwsiurl!=null &&
              java.util.Arrays.equals(this.xmlwsiurl, other.getXmlwsiurl()))) &&
            ((this.xmlvalidationurl==null && other.getXmlvalidationurl()==null) || 
             (this.xmlvalidationurl!=null &&
              java.util.Arrays.equals(this.xmlvalidationurl, other.getXmlvalidationurl()))) &&
            ((this.xmlattachmenturl==null && other.getXmlattachmenturl()==null) || 
             (this.xmlattachmenturl!=null &&
              java.util.Arrays.equals(this.xmlattachmenturl, other.getXmlattachmenturl()))) &&
            ((this.xmlsqlinjection==null && other.getXmlsqlinjection()==null) || 
             (this.xmlsqlinjection!=null &&
              java.util.Arrays.equals(this.xmlsqlinjection, other.getXmlsqlinjection()))) &&
            ((this.isregex6==null && other.getIsregex6()==null) || 
             (this.isregex6!=null &&
              java.util.Arrays.equals(this.isregex6, other.getIsregex6()))) &&
            ((this.location3==null && other.getLocation3()==null) || 
             (this.location3!=null &&
              java.util.Arrays.equals(this.location3, other.getLocation3()))) &&
            ((this.xmlxss==null && other.getXmlxss()==null) || 
             (this.xmlxss!=null &&
              java.util.Arrays.equals(this.xmlxss, other.getXmlxss()))) &&
            ((this.isregex7==null && other.getIsregex7()==null) || 
             (this.isregex7!=null &&
              java.util.Arrays.equals(this.isregex7, other.getIsregex7()))) &&
            ((this.location4==null && other.getLocation4()==null) || 
             (this.location4!=null &&
              java.util.Arrays.equals(this.location4, other.getLocation4()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.xmlmaxelementdepthcheck==null && other.getXmlmaxelementdepthcheck()==null) || 
             (this.xmlmaxelementdepthcheck!=null &&
              java.util.Arrays.equals(this.xmlmaxelementdepthcheck, other.getXmlmaxelementdepthcheck()))) &&
            ((this.xmlmaxelementdepth==null && other.getXmlmaxelementdepth()==null) || 
             (this.xmlmaxelementdepth!=null &&
              java.util.Arrays.equals(this.xmlmaxelementdepth, other.getXmlmaxelementdepth()))) &&
            ((this.xmlmaxelementnamelengthcheck==null && other.getXmlmaxelementnamelengthcheck()==null) || 
             (this.xmlmaxelementnamelengthcheck!=null &&
              java.util.Arrays.equals(this.xmlmaxelementnamelengthcheck, other.getXmlmaxelementnamelengthcheck()))) &&
            ((this.xmlmaxelementnamelength==null && other.getXmlmaxelementnamelength()==null) || 
             (this.xmlmaxelementnamelength!=null &&
              java.util.Arrays.equals(this.xmlmaxelementnamelength, other.getXmlmaxelementnamelength()))) &&
            ((this.xmlmaxelementscheck==null && other.getXmlmaxelementscheck()==null) || 
             (this.xmlmaxelementscheck!=null &&
              java.util.Arrays.equals(this.xmlmaxelementscheck, other.getXmlmaxelementscheck()))) &&
            ((this.xmlmaxelements==null && other.getXmlmaxelements()==null) || 
             (this.xmlmaxelements!=null &&
              java.util.Arrays.equals(this.xmlmaxelements, other.getXmlmaxelements()))) &&
            ((this.xmlmaxelementchildrencheck==null && other.getXmlmaxelementchildrencheck()==null) || 
             (this.xmlmaxelementchildrencheck!=null &&
              java.util.Arrays.equals(this.xmlmaxelementchildrencheck, other.getXmlmaxelementchildrencheck()))) &&
            ((this.xmlmaxelementchildren==null && other.getXmlmaxelementchildren()==null) || 
             (this.xmlmaxelementchildren!=null &&
              java.util.Arrays.equals(this.xmlmaxelementchildren, other.getXmlmaxelementchildren()))) &&
            ((this.xmlmaxnodescheck==null && other.getXmlmaxnodescheck()==null) || 
             (this.xmlmaxnodescheck!=null &&
              java.util.Arrays.equals(this.xmlmaxnodescheck, other.getXmlmaxnodescheck()))) &&
            ((this.xmlmaxnodes==null && other.getXmlmaxnodes()==null) || 
             (this.xmlmaxnodes!=null &&
              java.util.Arrays.equals(this.xmlmaxnodes, other.getXmlmaxnodes()))) &&
            ((this.xmlmaxattributescheck==null && other.getXmlmaxattributescheck()==null) || 
             (this.xmlmaxattributescheck!=null &&
              java.util.Arrays.equals(this.xmlmaxattributescheck, other.getXmlmaxattributescheck()))) &&
            ((this.xmlmaxattributes==null && other.getXmlmaxattributes()==null) || 
             (this.xmlmaxattributes!=null &&
              java.util.Arrays.equals(this.xmlmaxattributes, other.getXmlmaxattributes()))) &&
            ((this.xmlmaxattributenamelengthcheck==null && other.getXmlmaxattributenamelengthcheck()==null) || 
             (this.xmlmaxattributenamelengthcheck!=null &&
              java.util.Arrays.equals(this.xmlmaxattributenamelengthcheck, other.getXmlmaxattributenamelengthcheck()))) &&
            ((this.xmlmaxattributenamelength==null && other.getXmlmaxattributenamelength()==null) || 
             (this.xmlmaxattributenamelength!=null &&
              java.util.Arrays.equals(this.xmlmaxattributenamelength, other.getXmlmaxattributenamelength()))) &&
            ((this.xmlmaxattributevaluelengthcheck==null && other.getXmlmaxattributevaluelengthcheck()==null) || 
             (this.xmlmaxattributevaluelengthcheck!=null &&
              java.util.Arrays.equals(this.xmlmaxattributevaluelengthcheck, other.getXmlmaxattributevaluelengthcheck()))) &&
            ((this.xmlmaxattributevaluelength==null && other.getXmlmaxattributevaluelength()==null) || 
             (this.xmlmaxattributevaluelength!=null &&
              java.util.Arrays.equals(this.xmlmaxattributevaluelength, other.getXmlmaxattributevaluelength()))) &&
            ((this.xmlmaxchardatalengthcheck==null && other.getXmlmaxchardatalengthcheck()==null) || 
             (this.xmlmaxchardatalengthcheck!=null &&
              java.util.Arrays.equals(this.xmlmaxchardatalengthcheck, other.getXmlmaxchardatalengthcheck()))) &&
            ((this.xmlmaxchardatalength==null && other.getXmlmaxchardatalength()==null) || 
             (this.xmlmaxchardatalength!=null &&
              java.util.Arrays.equals(this.xmlmaxchardatalength, other.getXmlmaxchardatalength()))) &&
            ((this.xmlmaxfilesizecheck==null && other.getXmlmaxfilesizecheck()==null) || 
             (this.xmlmaxfilesizecheck!=null &&
              java.util.Arrays.equals(this.xmlmaxfilesizecheck, other.getXmlmaxfilesizecheck()))) &&
            ((this.xmlmaxfilesize==null && other.getXmlmaxfilesize()==null) || 
             (this.xmlmaxfilesize!=null &&
              java.util.Arrays.equals(this.xmlmaxfilesize, other.getXmlmaxfilesize()))) &&
            ((this.xmlminfilesizecheck==null && other.getXmlminfilesizecheck()==null) || 
             (this.xmlminfilesizecheck!=null &&
              java.util.Arrays.equals(this.xmlminfilesizecheck, other.getXmlminfilesizecheck()))) &&
            ((this.xmlminfilesize==null && other.getXmlminfilesize()==null) || 
             (this.xmlminfilesize!=null &&
              java.util.Arrays.equals(this.xmlminfilesize, other.getXmlminfilesize()))) &&
            ((this.xmlblockpi==null && other.getXmlblockpi()==null) || 
             (this.xmlblockpi!=null &&
              java.util.Arrays.equals(this.xmlblockpi, other.getXmlblockpi()))) &&
            ((this.xmlblockdtd==null && other.getXmlblockdtd()==null) || 
             (this.xmlblockdtd!=null &&
              java.util.Arrays.equals(this.xmlblockdtd, other.getXmlblockdtd()))) &&
            ((this.xmlblockexternalentities==null && other.getXmlblockexternalentities()==null) || 
             (this.xmlblockexternalentities!=null &&
              java.util.Arrays.equals(this.xmlblockexternalentities, other.getXmlblockexternalentities()))) &&
            ((this.xmlmaxentityexpansionscheck==null && other.getXmlmaxentityexpansionscheck()==null) || 
             (this.xmlmaxentityexpansionscheck!=null &&
              java.util.Arrays.equals(this.xmlmaxentityexpansionscheck, other.getXmlmaxentityexpansionscheck()))) &&
            ((this.xmlmaxentityexpansions==null && other.getXmlmaxentityexpansions()==null) || 
             (this.xmlmaxentityexpansions!=null &&
              java.util.Arrays.equals(this.xmlmaxentityexpansions, other.getXmlmaxentityexpansions()))) &&
            ((this.xmlmaxentityexpansiondepthcheck==null && other.getXmlmaxentityexpansiondepthcheck()==null) || 
             (this.xmlmaxentityexpansiondepthcheck!=null &&
              java.util.Arrays.equals(this.xmlmaxentityexpansiondepthcheck, other.getXmlmaxentityexpansiondepthcheck()))) &&
            ((this.xmlmaxentityexpansiondepth==null && other.getXmlmaxentityexpansiondepth()==null) || 
             (this.xmlmaxentityexpansiondepth!=null &&
              java.util.Arrays.equals(this.xmlmaxentityexpansiondepth, other.getXmlmaxentityexpansiondepth()))) &&
            ((this.xmlmaxnamespacescheck==null && other.getXmlmaxnamespacescheck()==null) || 
             (this.xmlmaxnamespacescheck!=null &&
              java.util.Arrays.equals(this.xmlmaxnamespacescheck, other.getXmlmaxnamespacescheck()))) &&
            ((this.xmlmaxnamespaces==null && other.getXmlmaxnamespaces()==null) || 
             (this.xmlmaxnamespaces!=null &&
              java.util.Arrays.equals(this.xmlmaxnamespaces, other.getXmlmaxnamespaces()))) &&
            ((this.xmlmaxnamespaceurilengthcheck==null && other.getXmlmaxnamespaceurilengthcheck()==null) || 
             (this.xmlmaxnamespaceurilengthcheck!=null &&
              java.util.Arrays.equals(this.xmlmaxnamespaceurilengthcheck, other.getXmlmaxnamespaceurilengthcheck()))) &&
            ((this.xmlmaxnamespaceurilength==null && other.getXmlmaxnamespaceurilength()==null) || 
             (this.xmlmaxnamespaceurilength!=null &&
              java.util.Arrays.equals(this.xmlmaxnamespaceurilength, other.getXmlmaxnamespaceurilength()))) &&
            ((this.xmlsoaparraycheck==null && other.getXmlsoaparraycheck()==null) || 
             (this.xmlsoaparraycheck!=null &&
              java.util.Arrays.equals(this.xmlsoaparraycheck, other.getXmlsoaparraycheck()))) &&
            ((this.xmlmaxsoaparraysize==null && other.getXmlmaxsoaparraysize()==null) || 
             (this.xmlmaxsoaparraysize!=null &&
              java.util.Arrays.equals(this.xmlmaxsoaparraysize, other.getXmlmaxsoaparraysize()))) &&
            ((this.xmlmaxsoaparrayrank==null && other.getXmlmaxsoaparrayrank()==null) || 
             (this.xmlmaxsoaparrayrank!=null &&
              java.util.Arrays.equals(this.xmlmaxsoaparrayrank, other.getXmlmaxsoaparrayrank()))) &&
            ((this.xmlwsichecks==null && other.getXmlwsichecks()==null) || 
             (this.xmlwsichecks!=null &&
              java.util.Arrays.equals(this.xmlwsichecks, other.getXmlwsichecks()))) &&
            ((this.xmlrequestschema==null && other.getXmlrequestschema()==null) || 
             (this.xmlrequestschema!=null &&
              java.util.Arrays.equals(this.xmlrequestschema, other.getXmlrequestschema()))) &&
            ((this.xmlresponseschema==null && other.getXmlresponseschema()==null) || 
             (this.xmlresponseschema!=null &&
              java.util.Arrays.equals(this.xmlresponseschema, other.getXmlresponseschema()))) &&
            ((this.xmlwsdl==null && other.getXmlwsdl()==null) || 
             (this.xmlwsdl!=null &&
              java.util.Arrays.equals(this.xmlwsdl, other.getXmlwsdl()))) &&
            ((this.xmladditionalsoapheaders==null && other.getXmladditionalsoapheaders()==null) || 
             (this.xmladditionalsoapheaders!=null &&
              java.util.Arrays.equals(this.xmladditionalsoapheaders, other.getXmladditionalsoapheaders()))) &&
            ((this.xmlendpointcheck==null && other.getXmlendpointcheck()==null) || 
             (this.xmlendpointcheck!=null &&
              java.util.Arrays.equals(this.xmlendpointcheck, other.getXmlendpointcheck()))) &&
            ((this.xmlvalidatesoapenvelope==null && other.getXmlvalidatesoapenvelope()==null) || 
             (this.xmlvalidatesoapenvelope!=null &&
              java.util.Arrays.equals(this.xmlvalidatesoapenvelope, other.getXmlvalidatesoapenvelope()))) &&
            ((this.xmlvalidateresponse==null && other.getXmlvalidateresponse()==null) || 
             (this.xmlvalidateresponse!=null &&
              java.util.Arrays.equals(this.xmlvalidateresponse, other.getXmlvalidateresponse()))) &&
            ((this.xmlmaxattachmentsizecheck==null && other.getXmlmaxattachmentsizecheck()==null) || 
             (this.xmlmaxattachmentsizecheck!=null &&
              java.util.Arrays.equals(this.xmlmaxattachmentsizecheck, other.getXmlmaxattachmentsizecheck()))) &&
            ((this.xmlmaxattachmentsize==null && other.getXmlmaxattachmentsize()==null) || 
             (this.xmlmaxattachmentsize!=null &&
              java.util.Arrays.equals(this.xmlmaxattachmentsize, other.getXmlmaxattachmentsize()))) &&
            ((this.xmlattachmentcontenttypecheck==null && other.getXmlattachmentcontenttypecheck()==null) || 
             (this.xmlattachmentcontenttypecheck!=null &&
              java.util.Arrays.equals(this.xmlattachmentcontenttypecheck, other.getXmlattachmentcontenttypecheck()))) &&
            ((this.xmlattachmentcontenttype==null && other.getXmlattachmentcontenttype()==null) || 
             (this.xmlattachmentcontenttype!=null &&
              java.util.Arrays.equals(this.xmlattachmentcontenttype, other.getXmlattachmentcontenttype()))) &&
            this.builtin == other.isBuiltin() &&
            ((this.trustedlearningclients==null && other.getTrustedlearningclients()==null) || 
             (this.trustedlearningclients!=null &&
              java.util.Arrays.equals(this.trustedlearningclients, other.getTrustedlearningclients()))) &&
            ((this.contenttype==null && other.getContenttype()==null) || 
             (this.contenttype!=null &&
              java.util.Arrays.equals(this.contenttype, other.getContenttype()))) &&
            ((this.excluderescontenttype==null && other.getExcluderescontenttype()==null) || 
             (this.excluderescontenttype!=null &&
              java.util.Arrays.equals(this.excluderescontenttype, other.getExcluderescontenttype()))) &&
            ((this.starturlstate==null && other.getStarturlstate()==null) || 
             (this.starturlstate!=null &&
              java.util.Arrays.equals(this.starturlstate, other.getStarturlstate()))) &&
            ((this.starturlcomment==null && other.getStarturlcomment()==null) || 
             (this.starturlcomment!=null &&
              java.util.Arrays.equals(this.starturlcomment, other.getStarturlcomment()))) &&
            ((this.denyurlstate==null && other.getDenyurlstate()==null) || 
             (this.denyurlstate!=null &&
              java.util.Arrays.equals(this.denyurlstate, other.getDenyurlstate()))) &&
            ((this.denyurlcomment==null && other.getDenyurlcomment()==null) || 
             (this.denyurlcomment!=null &&
              java.util.Arrays.equals(this.denyurlcomment, other.getDenyurlcomment()))) &&
            ((this.fieldconsistencystate==null && other.getFieldconsistencystate()==null) || 
             (this.fieldconsistencystate!=null &&
              java.util.Arrays.equals(this.fieldconsistencystate, other.getFieldconsistencystate()))) &&
            ((this.fieldconsistencycomment==null && other.getFieldconsistencycomment()==null) || 
             (this.fieldconsistencycomment!=null &&
              java.util.Arrays.equals(this.fieldconsistencycomment, other.getFieldconsistencycomment()))) &&
            ((this.cookieconsistencystate==null && other.getCookieconsistencystate()==null) || 
             (this.cookieconsistencystate!=null &&
              java.util.Arrays.equals(this.cookieconsistencystate, other.getCookieconsistencystate()))) &&
            ((this.cookieconsistencycomment==null && other.getCookieconsistencycomment()==null) || 
             (this.cookieconsistencycomment!=null &&
              java.util.Arrays.equals(this.cookieconsistencycomment, other.getCookieconsistencycomment()))) &&
            ((this.csrfformoriginurl==null && other.getCsrfformoriginurl()==null) || 
             (this.csrfformoriginurl!=null &&
              java.util.Arrays.equals(this.csrfformoriginurl, other.getCsrfformoriginurl()))) &&
            ((this.csrftagstate==null && other.getCsrftagstate()==null) || 
             (this.csrftagstate!=null &&
              java.util.Arrays.equals(this.csrftagstate, other.getCsrftagstate()))) &&
            ((this.csrftagcomment==null && other.getCsrftagcomment()==null) || 
             (this.csrftagcomment!=null &&
              java.util.Arrays.equals(this.csrftagcomment, other.getCsrftagcomment()))) &&
            ((this.crosssitescriptingstate==null && other.getCrosssitescriptingstate()==null) || 
             (this.crosssitescriptingstate!=null &&
              java.util.Arrays.equals(this.crosssitescriptingstate, other.getCrosssitescriptingstate()))) &&
            ((this.crosssitescriptingcomment==null && other.getCrosssitescriptingcomment()==null) || 
             (this.crosssitescriptingcomment!=null &&
              java.util.Arrays.equals(this.crosssitescriptingcomment, other.getCrosssitescriptingcomment()))) &&
            ((this.sqlinjectionstate==null && other.getSqlinjectionstate()==null) || 
             (this.sqlinjectionstate!=null &&
              java.util.Arrays.equals(this.sqlinjectionstate, other.getSqlinjectionstate()))) &&
            ((this.sqlinjectioncomment==null && other.getSqlinjectioncomment()==null) || 
             (this.sqlinjectioncomment!=null &&
              java.util.Arrays.equals(this.sqlinjectioncomment, other.getSqlinjectioncomment()))) &&
            ((this.fieldformatstate==null && other.getFieldformatstate()==null) || 
             (this.fieldformatstate!=null &&
              java.util.Arrays.equals(this.fieldformatstate, other.getFieldformatstate()))) &&
            ((this.fieldformatcomment==null && other.getFieldformatcomment()==null) || 
             (this.fieldformatcomment!=null &&
              java.util.Arrays.equals(this.fieldformatcomment, other.getFieldformatcomment()))) &&
            ((this.safeobjectstate==null && other.getSafeobjectstate()==null) || 
             (this.safeobjectstate!=null &&
              java.util.Arrays.equals(this.safeobjectstate, other.getSafeobjectstate()))) &&
            ((this.safeobjectcomment==null && other.getSafeobjectcomment()==null) || 
             (this.safeobjectcomment!=null &&
              java.util.Arrays.equals(this.safeobjectcomment, other.getSafeobjectcomment()))) &&
            ((this.trustedlearningstate==null && other.getTrustedlearningstate()==null) || 
             (this.trustedlearningstate!=null &&
              java.util.Arrays.equals(this.trustedlearningstate, other.getTrustedlearningstate()))) &&
            ((this.trustedlearningcomment==null && other.getTrustedlearningcomment()==null) || 
             (this.trustedlearningcomment!=null &&
              java.util.Arrays.equals(this.trustedlearningcomment, other.getTrustedlearningcomment()))) &&
            ((this.xmldosstate==null && other.getXmldosstate()==null) || 
             (this.xmldosstate!=null &&
              java.util.Arrays.equals(this.xmldosstate, other.getXmldosstate()))) &&
            ((this.xmldoscomment==null && other.getXmldoscomment()==null) || 
             (this.xmldoscomment!=null &&
              java.util.Arrays.equals(this.xmldoscomment, other.getXmldoscomment()))) &&
            ((this.xmlwsistate==null && other.getXmlwsistate()==null) || 
             (this.xmlwsistate!=null &&
              java.util.Arrays.equals(this.xmlwsistate, other.getXmlwsistate()))) &&
            ((this.xmlwsicomment==null && other.getXmlwsicomment()==null) || 
             (this.xmlwsicomment!=null &&
              java.util.Arrays.equals(this.xmlwsicomment, other.getXmlwsicomment()))) &&
            ((this.xmlvalidationstate==null && other.getXmlvalidationstate()==null) || 
             (this.xmlvalidationstate!=null &&
              java.util.Arrays.equals(this.xmlvalidationstate, other.getXmlvalidationstate()))) &&
            ((this.xmlvalidationcomment==null && other.getXmlvalidationcomment()==null) || 
             (this.xmlvalidationcomment!=null &&
              java.util.Arrays.equals(this.xmlvalidationcomment, other.getXmlvalidationcomment()))) &&
            ((this.xmlattachmentstate==null && other.getXmlattachmentstate()==null) || 
             (this.xmlattachmentstate!=null &&
              java.util.Arrays.equals(this.xmlattachmentstate, other.getXmlattachmentstate()))) &&
            ((this.xmlattachmentcomment==null && other.getXmlattachmentcomment()==null) || 
             (this.xmlattachmentcomment!=null &&
              java.util.Arrays.equals(this.xmlattachmentcomment, other.getXmlattachmentcomment()))) &&
            ((this.xmlsqlinjectionstate==null && other.getXmlsqlinjectionstate()==null) || 
             (this.xmlsqlinjectionstate!=null &&
              java.util.Arrays.equals(this.xmlsqlinjectionstate, other.getXmlsqlinjectionstate()))) &&
            ((this.xmlsqlinjectioncomment==null && other.getXmlsqlinjectioncomment()==null) || 
             (this.xmlsqlinjectioncomment!=null &&
              java.util.Arrays.equals(this.xmlsqlinjectioncomment, other.getXmlsqlinjectioncomment()))) &&
            ((this.xmlxssstate==null && other.getXmlxssstate()==null) || 
             (this.xmlxssstate!=null &&
              java.util.Arrays.equals(this.xmlxssstate, other.getXmlxssstate()))) &&
            ((this.xmlxsscomment==null && other.getXmlxsscomment()==null) || 
             (this.xmlxsscomment!=null &&
              java.util.Arrays.equals(this.xmlxsscomment, other.getXmlxsscomment()))) &&
            ((this.contenttypestate==null && other.getContenttypestate()==null) || 
             (this.contenttypestate!=null &&
              java.util.Arrays.equals(this.contenttypestate, other.getContenttypestate()))) &&
            ((this.contenttypecomment==null && other.getContenttypecomment()==null) || 
             (this.contenttypecomment!=null &&
              java.util.Arrays.equals(this.contenttypecomment, other.getContenttypecomment()))) &&
            ((this.excluderescontenttypestate==null && other.getExcluderescontenttypestate()==null) || 
             (this.excluderescontenttypestate!=null &&
              java.util.Arrays.equals(this.excluderescontenttypestate, other.getExcluderescontenttypestate()))) &&
            ((this.excluderescontenttypestatecomment==null && other.getExcluderescontenttypestatecomment()==null) || 
             (this.excluderescontenttypestatecomment!=null &&
              java.util.Arrays.equals(this.excluderescontenttypestatecomment, other.getExcluderescontenttypestatecomment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDefaults() != null) {
            _hashCode += getDefaults().hashCode();
        }
        if (getUsehtmlerrorobject() != null) {
            _hashCode += getUsehtmlerrorobject().hashCode();
        }
        if (getErrorurl() != null) {
            _hashCode += getErrorurl().hashCode();
        }
        if (getHtmlerrorobject() != null) {
            _hashCode += getHtmlerrorobject().hashCode();
        }
        if (getLogeverypolicyhit() != null) {
            _hashCode += getLogeverypolicyhit().hashCode();
        }
        if (getStripcomments() != null) {
            _hashCode += getStripcomments().hashCode();
        }
        if (getStriphtmlcomments() != null) {
            _hashCode += getStriphtmlcomments().hashCode();
        }
        if (getStripxmlcomments() != null) {
            _hashCode += getStripxmlcomments().hashCode();
        }
        if (getDefaultcharset() != null) {
            _hashCode += getDefaultcharset().hashCode();
        }
        if (getPostbodylimit() != null) {
            _hashCode += getPostbodylimit().hashCode();
        }
        if (getFileuploadmaxnum() != null) {
            _hashCode += getFileuploadmaxnum().hashCode();
        }
        if (getCanonicalizehtmlresponse() != null) {
            _hashCode += getCanonicalizehtmlresponse().hashCode();
        }
        if (getEnableformtagging() != null) {
            _hashCode += getEnableformtagging().hashCode();
        }
        if (getSessionlessfieldconsistency() != null) {
            _hashCode += getSessionlessfieldconsistency().hashCode();
        }
        if (getSessionlessurlclosure() != null) {
            _hashCode += getSessionlessurlclosure().hashCode();
        }
        if (getSemicolonfieldseparator() != null) {
            _hashCode += getSemicolonfieldseparator().hashCode();
        }
        if (getExcludefileuploadfromchecks() != null) {
            _hashCode += getExcludefileuploadfromchecks().hashCode();
        }
        if (getSqlinjectionparsecomments() != null) {
            _hashCode += getSqlinjectionparsecomments().hashCode();
        }
        if (getCheckrequestheaders() != null) {
            _hashCode += getCheckrequestheaders().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getStarturlaction() != null) {
            _hashCode += getStarturlaction().hashCode();
        }
        if (getStarturl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStarturl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStarturl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStarturlclosure() != null) {
            _hashCode += getStarturlclosure().hashCode();
        }
        if (getDenyurlaction() != null) {
            _hashCode += getDenyurlaction().hashCode();
        }
        if (getDenyurl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDenyurl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDenyurl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRefererheadercheck() != null) {
            _hashCode += getRefererheadercheck().hashCode();
        }
        if (getCsrftagaction() != null) {
            _hashCode += getCsrftagaction().hashCode();
        }
        if (getCsrftag() != null) {
            _hashCode += getCsrftag().hashCode();
        }
        if (getCsrfformactionurl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsrfformactionurl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsrfformactionurl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrosssitescriptingaction() != null) {
            _hashCode += getCrosssitescriptingaction().hashCode();
        }
        if (getCrosssitescriptingtransformunsafehtml() != null) {
            _hashCode += getCrosssitescriptingtransformunsafehtml().hashCode();
        }
        if (getCrosssitescriptingcheckcompleteurls() != null) {
            _hashCode += getCrosssitescriptingcheckcompleteurls().hashCode();
        }
        if (getCrosssitescripting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrosssitescripting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrosssitescripting(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsregex() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsregex());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsregex(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormactionurl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormactionurl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormactionurl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExemptclosureurlsfromsecuritychecks() != null) {
            _hashCode += getExemptclosureurlsfromsecuritychecks().hashCode();
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSqlinjectionaction() != null) {
            _hashCode += getSqlinjectionaction().hashCode();
        }
        if (getSqlinjectiontransformspecialchars() != null) {
            _hashCode += getSqlinjectiontransformspecialchars().hashCode();
        }
        if (getSqlinjectiononlycheckfieldswithsqlchars() != null) {
            _hashCode += getSqlinjectiononlycheckfieldswithsqlchars().hashCode();
        }
        if (getSqlinjectionchecksqlwildchars() != null) {
            _hashCode += getSqlinjectionchecksqlwildchars().hashCode();
        }
        if (getSqlinjection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSqlinjection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSqlinjection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsregex2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsregex2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsregex2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormactionurl2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormactionurl2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormactionurl2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvalidpercenthandling() != null) {
            _hashCode += getInvalidpercenthandling().hashCode();
        }
        if (getLocation2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldconsistencyaction() != null) {
            _hashCode += getFieldconsistencyaction().hashCode();
        }
        if (getFieldconsistency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldconsistency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldconsistency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsregex3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsregex3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsregex3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormactionurl3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormactionurl3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormactionurl3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCookieconsistencyaction() != null) {
            _hashCode += getCookieconsistencyaction().hashCode();
        }
        if (getCookieconsistency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCookieconsistency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCookieconsistency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsregex4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsregex4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsregex4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCookietransforms() != null) {
            _hashCode += getCookietransforms().hashCode();
        }
        if (getCookieencryption() != null) {
            _hashCode += getCookieencryption().hashCode();
        }
        if (getCookieproxying() != null) {
            _hashCode += getCookieproxying().hashCode();
        }
        if (getAddcookieflags() != null) {
            _hashCode += getAddcookieflags().hashCode();
        }
        if (getBufferoverflowaction() != null) {
            _hashCode += getBufferoverflowaction().hashCode();
        }
        if (getBufferoverflowmaxurllength() != null) {
            _hashCode += getBufferoverflowmaxurllength().hashCode();
        }
        if (getBufferoverflowmaxheaderlength() != null) {
            _hashCode += getBufferoverflowmaxheaderlength().hashCode();
        }
        if (getBufferoverflowmaxcookielength() != null) {
            _hashCode += getBufferoverflowmaxcookielength().hashCode();
        }
        if (getFieldformataction() != null) {
            _hashCode += getFieldformataction().hashCode();
        }
        if (getDefaultfieldformattype() != null) {
            _hashCode += getDefaultfieldformattype().hashCode();
        }
        if (getDefaultfieldformatminlength() != null) {
            _hashCode += getDefaultfieldformatminlength().hashCode();
        }
        if (getDefaultfieldformatmaxlength() != null) {
            _hashCode += getDefaultfieldformatmaxlength().hashCode();
        }
        if (getFieldformat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldformat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldformat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsregex5() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsregex5());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsregex5(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormactionurl4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormactionurl4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormactionurl4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldformatminlength() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldformatminlength());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldformatminlength(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldformatmaxlength() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldformatmaxlength());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldformatmaxlength(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditcardaction() != null) {
            _hashCode += getCreditcardaction().hashCode();
        }
        if (getCreditcard() != null) {
            _hashCode += getCreditcard().hashCode();
        }
        if (getCreditcardmaxallowed() != null) {
            _hashCode += getCreditcardmaxallowed().hashCode();
        }
        if (getCreditcardxout() != null) {
            _hashCode += getCreditcardxout().hashCode();
        }
        if (getSafeobject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSafeobject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSafeobject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxmatchlength() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaxmatchlength());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaxmatchlength(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActioN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActioN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActioN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestcontenttype() != null) {
            _hashCode += getRequestcontenttype().hashCode();
        }
        if (getResponsecontenttype() != null) {
            _hashCode += getResponsecontenttype().hashCode();
        }
        if (getXmlerrorobject() != null) {
            _hashCode += getXmlerrorobject().hashCode();
        }
        if (getSignatures() != null) {
            _hashCode += getSignatures().hashCode();
        }
        if (get_xmlformataction() != null) {
            _hashCode += get_xmlformataction().hashCode();
        }
        if (get_xmldosaction() != null) {
            _hashCode += get_xmldosaction().hashCode();
        }
        if (get_xmlsqlinjectionaction() != null) {
            _hashCode += get_xmlsqlinjectionaction().hashCode();
        }
        if (getXmlsqlinjectiononlycheckfieldswithsqlchars() != null) {
            _hashCode += getXmlsqlinjectiononlycheckfieldswithsqlchars().hashCode();
        }
        if (getXmlsqlinjectionchecksqlwildchars() != null) {
            _hashCode += getXmlsqlinjectionchecksqlwildchars().hashCode();
        }
        if (getXmlsqlinjectionparsecomments() != null) {
            _hashCode += getXmlsqlinjectionparsecomments().hashCode();
        }
        if (get_xmlxssaction() != null) {
            _hashCode += get_xmlxssaction().hashCode();
        }
        if (get_xmlwsiaction() != null) {
            _hashCode += get_xmlwsiaction().hashCode();
        }
        if (get_xmlattachmentaction() != null) {
            _hashCode += get_xmlattachmentaction().hashCode();
        }
        if (get_xmlvalidationaction() != null) {
            _hashCode += get_xmlvalidationaction().hashCode();
        }
        if (getXmlsoapfaultaction() != null) {
            _hashCode += getXmlsoapfaultaction().hashCode();
        }
        if (getXmldosurl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmldosurl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmldosurl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlwsiurl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlwsiurl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlwsiurl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlvalidationurl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlvalidationurl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlvalidationurl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlattachmenturl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlattachmenturl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlattachmenturl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlsqlinjection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlsqlinjection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlsqlinjection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsregex6() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsregex6());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsregex6(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlxss() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlxss());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlxss(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsregex7() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsregex7());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsregex7(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getXmlmaxelementdepthcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxelementdepthcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxelementdepthcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxelementdepth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxelementdepth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxelementdepth(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxelementnamelengthcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxelementnamelengthcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxelementnamelengthcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxelementnamelength() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxelementnamelength());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxelementnamelength(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxelementscheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxelementscheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxelementscheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxelements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxelements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxelements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxelementchildrencheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxelementchildrencheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxelementchildrencheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxelementchildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxelementchildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxelementchildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxnodescheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxnodescheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxnodescheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxnodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxnodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxnodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxattributescheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxattributescheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxattributescheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxattributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxattributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxattributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxattributenamelengthcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxattributenamelengthcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxattributenamelengthcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxattributenamelength() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxattributenamelength());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxattributenamelength(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxattributevaluelengthcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxattributevaluelengthcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxattributevaluelengthcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxattributevaluelength() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxattributevaluelength());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxattributevaluelength(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxchardatalengthcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxchardatalengthcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxchardatalengthcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxchardatalength() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxchardatalength());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxchardatalength(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxfilesizecheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxfilesizecheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxfilesizecheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxfilesize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxfilesize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxfilesize(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlminfilesizecheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlminfilesizecheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlminfilesizecheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlminfilesize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlminfilesize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlminfilesize(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlblockpi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlblockpi());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlblockpi(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlblockdtd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlblockdtd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlblockdtd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlblockexternalentities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlblockexternalentities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlblockexternalentities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxentityexpansionscheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxentityexpansionscheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxentityexpansionscheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxentityexpansions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxentityexpansions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxentityexpansions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxentityexpansiondepthcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxentityexpansiondepthcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxentityexpansiondepthcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxentityexpansiondepth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxentityexpansiondepth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxentityexpansiondepth(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxnamespacescheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxnamespacescheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxnamespacescheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxnamespaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxnamespaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxnamespaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxnamespaceurilengthcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxnamespaceurilengthcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxnamespaceurilengthcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxnamespaceurilength() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxnamespaceurilength());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxnamespaceurilength(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlsoaparraycheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlsoaparraycheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlsoaparraycheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxsoaparraysize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxsoaparraysize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxsoaparraysize(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxsoaparrayrank() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxsoaparrayrank());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxsoaparrayrank(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlwsichecks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlwsichecks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlwsichecks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlrequestschema() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlrequestschema());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlrequestschema(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlresponseschema() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlresponseschema());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlresponseschema(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlwsdl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlwsdl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlwsdl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmladditionalsoapheaders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmladditionalsoapheaders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmladditionalsoapheaders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlendpointcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlendpointcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlendpointcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlvalidatesoapenvelope() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlvalidatesoapenvelope());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlvalidatesoapenvelope(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlvalidateresponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlvalidateresponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlvalidateresponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxattachmentsizecheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxattachmentsizecheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxattachmentsizecheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlmaxattachmentsize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlmaxattachmentsize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlmaxattachmentsize(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlattachmentcontenttypecheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlattachmentcontenttypecheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlattachmentcontenttypecheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlattachmentcontenttype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlattachmentcontenttype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlattachmentcontenttype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isBuiltin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTrustedlearningclients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrustedlearningclients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrustedlearningclients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContenttype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContenttype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContenttype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcluderescontenttype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcluderescontenttype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcluderescontenttype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStarturlstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStarturlstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStarturlstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStarturlcomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStarturlcomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStarturlcomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDenyurlstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDenyurlstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDenyurlstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDenyurlcomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDenyurlcomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDenyurlcomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldconsistencystate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldconsistencystate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldconsistencystate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldconsistencycomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldconsistencycomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldconsistencycomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCookieconsistencystate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCookieconsistencystate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCookieconsistencystate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCookieconsistencycomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCookieconsistencycomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCookieconsistencycomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsrfformoriginurl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsrfformoriginurl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsrfformoriginurl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsrftagstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsrftagstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsrftagstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsrftagcomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsrftagcomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsrftagcomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrosssitescriptingstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrosssitescriptingstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrosssitescriptingstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrosssitescriptingcomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrosssitescriptingcomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrosssitescriptingcomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSqlinjectionstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSqlinjectionstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSqlinjectionstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSqlinjectioncomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSqlinjectioncomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSqlinjectioncomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldformatstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldformatstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldformatstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldformatcomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldformatcomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldformatcomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSafeobjectstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSafeobjectstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSafeobjectstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSafeobjectcomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSafeobjectcomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSafeobjectcomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrustedlearningstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrustedlearningstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrustedlearningstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrustedlearningcomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrustedlearningcomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrustedlearningcomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmldosstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmldosstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmldosstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmldoscomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmldoscomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmldoscomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlwsistate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlwsistate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlwsistate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlwsicomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlwsicomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlwsicomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlvalidationstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlvalidationstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlvalidationstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlvalidationcomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlvalidationcomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlvalidationcomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlattachmentstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlattachmentstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlattachmentstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlattachmentcomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlattachmentcomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlattachmentcomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlsqlinjectionstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlsqlinjectionstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlsqlinjectionstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlsqlinjectioncomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlsqlinjectioncomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlsqlinjectioncomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlxssstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlxssstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlxssstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlxsscomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlxsscomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlxsscomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContenttypestate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContenttypestate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContenttypestate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContenttypecomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContenttypecomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContenttypecomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcluderescontenttypestate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcluderescontenttypestate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcluderescontenttypestate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcluderescontenttypestatecomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcluderescontenttypestatecomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcluderescontenttypestatecomment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Appfwprofile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appfwprofile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usehtmlerrorobject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usehtmlerrorobject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmlerrorobject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "htmlerrorobject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logeverypolicyhit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logeverypolicyhit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stripcomments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stripcomments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("striphtmlcomments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "striphtmlcomments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stripxmlcomments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stripxmlcomments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultcharset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultcharset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postbodylimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postbodylimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileuploadmaxnum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileuploadmaxnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canonicalizehtmlresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canonicalizehtmlresponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableformtagging");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enableformtagging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionlessfieldconsistency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionlessfieldconsistency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionlessurlclosure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionlessurlclosure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semicolonfieldseparator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "semicolonfieldseparator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludefileuploadfromchecks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excludefileuploadfromchecks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlinjectionparsecomments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlinjectionparsecomments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkrequestheaders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkrequestheaders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starturlaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starturlaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starturl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starturl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starturlclosure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starturlclosure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denyurlaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denyurlaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denyurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denyurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refererheadercheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refererheadercheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csrftagaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csrftagaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csrftag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csrftag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csrfformactionurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csrfformactionurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crosssitescriptingaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crosssitescriptingaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crosssitescriptingtransformunsafehtml");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crosssitescriptingtransformunsafehtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crosssitescriptingcheckcompleteurls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crosssitescriptingcheckcompleteurls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crosssitescripting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crosssitescripting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isregex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isregex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formactionurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formactionurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptclosureurlsfromsecuritychecks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exemptclosureurlsfromsecuritychecks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlinjectionaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlinjectionaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlinjectiontransformspecialchars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlinjectiontransformspecialchars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlinjectiononlycheckfieldswithsqlchars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlinjectiononlycheckfieldswithsqlchars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlinjectionchecksqlwildchars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlinjectionchecksqlwildchars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlinjection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlinjection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isregex2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isregex2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formactionurl2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formactionurl2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidpercenthandling");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invalidpercenthandling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldconsistencyaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldconsistencyaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldconsistency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldconsistency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isregex3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isregex3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formactionurl3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formactionurl3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieconsistencyaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieconsistencyaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieconsistency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieconsistency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isregex4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isregex4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookietransforms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookietransforms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieencryption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieencryption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieproxying");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieproxying"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addcookieflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addcookieflags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bufferoverflowaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bufferoverflowaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bufferoverflowmaxurllength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bufferoverflowmaxurllength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bufferoverflowmaxheaderlength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bufferoverflowmaxheaderlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bufferoverflowmaxcookielength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bufferoverflowmaxcookielength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldformataction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldformataction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultfieldformattype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultfieldformattype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultfieldformatminlength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultfieldformatminlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultfieldformatmaxlength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultfieldformatmaxlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldformat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldformat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isregex5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isregex5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formactionurl4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formactionurl4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldformatminlength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldformatminlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldformatmaxlength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldformatmaxlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditcardaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditcardaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditcard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditcard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditcardmaxallowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditcardmaxallowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditcardxout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditcardxout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safeobject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "safeobject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxmatchlength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxmatchlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actioN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actioN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestcontenttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestcontenttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsecontenttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsecontenttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlerrorobject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlerrorobject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_xmlformataction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_xmlformataction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_xmldosaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_xmldosaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_xmlsqlinjectionaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_xmlsqlinjectionaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlsqlinjectiononlycheckfieldswithsqlchars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlsqlinjectiononlycheckfieldswithsqlchars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlsqlinjectionchecksqlwildchars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlsqlinjectionchecksqlwildchars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlsqlinjectionparsecomments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlsqlinjectionparsecomments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_xmlxssaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_xmlxssaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_xmlwsiaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_xmlwsiaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_xmlattachmentaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_xmlattachmentaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_xmlvalidationaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_xmlvalidationaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlsoapfaultaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlsoapfaultaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmldosurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmldosurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlwsiurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlwsiurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlvalidationurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlvalidationurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlattachmenturl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlattachmenturl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlsqlinjection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlsqlinjection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isregex6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isregex6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlxss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlxss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isregex7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isregex7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxelementdepthcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxelementdepthcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxelementdepth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxelementdepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxelementnamelengthcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxelementnamelengthcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxelementnamelength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxelementnamelength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxelementscheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxelementscheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxelements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxelements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxelementchildrencheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxelementchildrencheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxelementchildren");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxelementchildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxnodescheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxnodescheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxnodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxnodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxattributescheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxattributescheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxattributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxattributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxattributenamelengthcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxattributenamelengthcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxattributenamelength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxattributenamelength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxattributevaluelengthcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxattributevaluelengthcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxattributevaluelength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxattributevaluelength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxchardatalengthcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxchardatalengthcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxchardatalength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxchardatalength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxfilesizecheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxfilesizecheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxfilesize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxfilesize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlminfilesizecheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlminfilesizecheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlminfilesize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlminfilesize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlblockpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlblockpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlblockdtd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlblockdtd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlblockexternalentities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlblockexternalentities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxentityexpansionscheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxentityexpansionscheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxentityexpansions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxentityexpansions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxentityexpansiondepthcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxentityexpansiondepthcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxentityexpansiondepth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxentityexpansiondepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxnamespacescheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxnamespacescheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxnamespaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxnamespaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxnamespaceurilengthcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxnamespaceurilengthcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxnamespaceurilength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxnamespaceurilength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlsoaparraycheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlsoaparraycheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxsoaparraysize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxsoaparraysize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxsoaparrayrank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxsoaparrayrank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlwsichecks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlwsichecks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlrequestschema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlrequestschema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlresponseschema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlresponseschema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlwsdl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlwsdl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmladditionalsoapheaders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmladditionalsoapheaders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlendpointcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlendpointcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlvalidatesoapenvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlvalidatesoapenvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlvalidateresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlvalidateresponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxattachmentsizecheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxattachmentsizecheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlmaxattachmentsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlmaxattachmentsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlattachmentcontenttypecheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlattachmentcontenttypecheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlattachmentcontenttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlattachmentcontenttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustedlearningclients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trustedlearningclients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contenttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contenttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluderescontenttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excluderescontenttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starturlstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starturlstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starturlcomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starturlcomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denyurlstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denyurlstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denyurlcomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denyurlcomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldconsistencystate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldconsistencystate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldconsistencycomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldconsistencycomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieconsistencystate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieconsistencystate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieconsistencycomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieconsistencycomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csrfformoriginurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csrfformoriginurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csrftagstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csrftagstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csrftagcomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csrftagcomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crosssitescriptingstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crosssitescriptingstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crosssitescriptingcomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crosssitescriptingcomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlinjectionstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlinjectionstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlinjectioncomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlinjectioncomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldformatstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldformatstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldformatcomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldformatcomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safeobjectstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "safeobjectstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safeobjectcomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "safeobjectcomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustedlearningstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trustedlearningstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustedlearningcomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trustedlearningcomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmldosstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmldosstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmldoscomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmldoscomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlwsistate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlwsistate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlwsicomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlwsicomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlvalidationstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlvalidationstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlvalidationcomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlvalidationcomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlattachmentstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlattachmentstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlattachmentcomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlattachmentcomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlsqlinjectionstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlsqlinjectionstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlsqlinjectioncomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlsqlinjectioncomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlxssstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlxssstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlxsscomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlxsscomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contenttypestate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contenttypestate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contenttypecomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contenttypecomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluderescontenttypestate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excluderescontenttypestate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluderescontenttypestatecomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excluderescontenttypestatecomment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
