
package com.example.consumingwebservice.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.consumingwebservice.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SimpleType_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "simpleType");
    private final static QName _ComplexType_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "complexType");
    private final static QName _Group_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "group");
    private final static QName _AttributeGroup_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "attributeGroup");
    private final static QName _Element_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "element");
    private final static QName _Attribute_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "attribute");
    private final static QName _AnyAttribute_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "anyAttribute");
    private final static QName _All_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "all");
    private final static QName _Choice_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "choice");
    private final static QName _Sequence_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "sequence");
    private final static QName _Unique_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "unique");
    private final static QName _Key_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "key");
    private final static QName _MinExclusive_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "minExclusive");
    private final static QName _MinInclusive_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "minInclusive");
    private final static QName _MaxExclusive_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "maxExclusive");
    private final static QName _MaxInclusive_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "maxInclusive");
    private final static QName _FractionDigits_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "fractionDigits");
    private final static QName _Length_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "length");
    private final static QName _MinLength_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "minLength");
    private final static QName _MaxLength_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "maxLength");
    private final static QName _Enumeration_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "enumeration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.consumingwebservice.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ByNameDataSet2 }
     * 
     */
    public ByNameDataSet2 createByNameDataSet2() {
        return new ByNameDataSet2();
    }

    /**
     * Create an instance of {@link QueryByNameDataSet2 }
     * 
     */
    public QueryByNameDataSet2 createQueryByNameDataSet2() {
        return new QueryByNameDataSet2();
    }

    /**
     * Create an instance of {@link Schema }
     * 
     */
    public Schema createSchema() {
        return new Schema();
    }

    /**
     * Create an instance of {@link OpenAttrs }
     * 
     */
    public OpenAttrs createOpenAttrs() {
        return new OpenAttrs();
    }

    /**
     * Create an instance of {@link Include }
     * 
     */
    public Include createInclude() {
        return new Include();
    }

    /**
     * Create an instance of {@link Annotated }
     * 
     */
    public Annotated createAnnotated() {
        return new Annotated();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link Appinfo }
     * 
     */
    public Appinfo createAppinfo() {
        return new Appinfo();
    }

    /**
     * Create an instance of {@link Documentation }
     * 
     */
    public Documentation createDocumentation() {
        return new Documentation();
    }

    /**
     * Create an instance of {@link Import }
     * 
     */
    public Import createImport() {
        return new Import();
    }

    /**
     * Create an instance of {@link Redefine }
     * 
     */
    public Redefine createRedefine() {
        return new Redefine();
    }

    /**
     * Create an instance of {@link TopLevelSimpleType }
     * 
     */
    public TopLevelSimpleType createTopLevelSimpleType() {
        return new TopLevelSimpleType();
    }

    /**
     * Create an instance of {@link TopLevelComplexType }
     * 
     */
    public TopLevelComplexType createTopLevelComplexType() {
        return new TopLevelComplexType();
    }

    /**
     * Create an instance of {@link NamedGroup }
     * 
     */
    public NamedGroup createNamedGroup() {
        return new NamedGroup();
    }

    /**
     * Create an instance of {@link NamedAttributeGroup }
     * 
     */
    public NamedAttributeGroup createNamedAttributeGroup() {
        return new NamedAttributeGroup();
    }

    /**
     * Create an instance of {@link TopLevelElement }
     * 
     */
    public TopLevelElement createTopLevelElement() {
        return new TopLevelElement();
    }

    /**
     * Create an instance of {@link TopLevelAttribute }
     * 
     */
    public TopLevelAttribute createTopLevelAttribute() {
        return new TopLevelAttribute();
    }

    /**
     * Create an instance of {@link Notation }
     * 
     */
    public Notation createNotation() {
        return new Notation();
    }

    /**
     * Create an instance of {@link Wildcard }
     * 
     */
    public Wildcard createWildcard() {
        return new Wildcard();
    }

    /**
     * Create an instance of {@link ComplexContent }
     * 
     */
    public ComplexContent createComplexContent() {
        return new ComplexContent();
    }

    /**
     * Create an instance of {@link ComplexRestrictionType }
     * 
     */
    public ComplexRestrictionType createComplexRestrictionType() {
        return new ComplexRestrictionType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link SimpleContent }
     * 
     */
    public SimpleContent createSimpleContent() {
        return new SimpleContent();
    }

    /**
     * Create an instance of {@link SimpleRestrictionType }
     * 
     */
    public SimpleRestrictionType createSimpleRestrictionType() {
        return new SimpleRestrictionType();
    }

    /**
     * Create an instance of {@link SimpleExtensionType }
     * 
     */
    public SimpleExtensionType createSimpleExtensionType() {
        return new SimpleExtensionType();
    }

    /**
     * Create an instance of {@link All }
     * 
     */
    public All createAll() {
        return new All();
    }

    /**
     * Create an instance of {@link ExplicitGroup }
     * 
     */
    public ExplicitGroup createExplicitGroup() {
        return new ExplicitGroup();
    }

    /**
     * Create an instance of {@link Any }
     * 
     */
    public Any createAny() {
        return new Any();
    }

    /**
     * Create an instance of {@link Selector }
     * 
     */
    public Selector createSelector() {
        return new Selector();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link Keybase }
     * 
     */
    public Keybase createKeybase() {
        return new Keybase();
    }

    /**
     * Create an instance of {@link Keyref }
     * 
     */
    public Keyref createKeyref() {
        return new Keyref();
    }

    /**
     * Create an instance of {@link Restriction }
     * 
     */
    public Restriction createRestriction() {
        return new Restriction();
    }

    /**
     * Create an instance of {@link LocalSimpleType }
     * 
     */
    public LocalSimpleType createLocalSimpleType() {
        return new LocalSimpleType();
    }

    /**
     * Create an instance of {@link Facet }
     * 
     */
    public Facet createFacet() {
        return new Facet();
    }

    /**
     * Create an instance of {@link TotalDigits }
     * 
     */
    public TotalDigits createTotalDigits() {
        return new TotalDigits();
    }

    /**
     * Create an instance of {@link NumFacet }
     * 
     */
    public NumFacet createNumFacet() {
        return new NumFacet();
    }

    /**
     * Create an instance of {@link NoFixedFacet }
     * 
     */
    public NoFixedFacet createNoFixedFacet() {
        return new NoFixedFacet();
    }

    /**
     * Create an instance of {@link WhiteSpace }
     * 
     */
    public WhiteSpace createWhiteSpace() {
        return new WhiteSpace();
    }

    /**
     * Create an instance of {@link Pattern }
     * 
     */
    public Pattern createPattern() {
        return new Pattern();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link Union }
     * 
     */
    public Union createUnion() {
        return new Union();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link LocalComplexType }
     * 
     */
    public LocalComplexType createLocalComplexType() {
        return new LocalComplexType();
    }

    /**
     * Create an instance of {@link RestrictionType }
     * 
     */
    public RestrictionType createRestrictionType() {
        return new RestrictionType();
    }

    /**
     * Create an instance of {@link LocalElement }
     * 
     */
    public LocalElement createLocalElement() {
        return new LocalElement();
    }

    /**
     * Create an instance of {@link RealGroup }
     * 
     */
    public RealGroup createRealGroup() {
        return new RealGroup();
    }

    /**
     * Create an instance of {@link GroupRef }
     * 
     */
    public GroupRef createGroupRef() {
        return new GroupRef();
    }

    /**
     * Create an instance of {@link SimpleExplicitGroup }
     * 
     */
    public SimpleExplicitGroup createSimpleExplicitGroup() {
        return new SimpleExplicitGroup();
    }

    /**
     * Create an instance of {@link NarrowMaxMin }
     * 
     */
    public NarrowMaxMin createNarrowMaxMin() {
        return new NarrowMaxMin();
    }

    /**
     * Create an instance of {@link AttributeGroupRef }
     * 
     */
    public AttributeGroupRef createAttributeGroupRef() {
        return new AttributeGroupRef();
    }

    /**
     * Create an instance of {@link AddInteger }
     * 
     */
    public AddInteger createAddInteger() {
        return new AddInteger();
    }

    /**
     * Create an instance of {@link AddIntegerResponse }
     * 
     */
    public AddIntegerResponse createAddIntegerResponse() {
        return new AddIntegerResponse();
    }

    /**
     * Create an instance of {@link DivideInteger }
     * 
     */
    public DivideInteger createDivideInteger() {
        return new DivideInteger();
    }

    /**
     * Create an instance of {@link DivideIntegerResponse }
     * 
     */
    public DivideIntegerResponse createDivideIntegerResponse() {
        return new DivideIntegerResponse();
    }

    /**
     * Create an instance of {@link FindPerson }
     * 
     */
    public FindPerson createFindPerson() {
        return new FindPerson();
    }

    /**
     * Create an instance of {@link FindPersonResponse }
     * 
     */
    public FindPersonResponse createFindPersonResponse() {
        return new FindPersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link GetByName }
     * 
     */
    public GetByName createGetByName() {
        return new GetByName();
    }

    /**
     * Create an instance of {@link GetByNameResponse }
     * 
     */
    public GetByNameResponse createGetByNameResponse() {
        return new GetByNameResponse();
    }

    /**
     * Create an instance of {@link DataSet }
     * 
     */
    public DataSet createDataSet() {
        return new DataSet();
    }

    /**
     * Create an instance of {@link GetDataSetByName }
     * 
     */
    public GetDataSetByName createGetDataSetByName() {
        return new GetDataSetByName();
    }

    /**
     * Create an instance of {@link GetDataSetByNameResponse }
     * 
     */
    public GetDataSetByNameResponse createGetDataSetByNameResponse() {
        return new GetDataSetByNameResponse();
    }

    /**
     * Create an instance of {@link ByNameDataSet }
     * 
     */
    public ByNameDataSet createByNameDataSet() {
        return new ByNameDataSet();
    }

    /**
     * Create an instance of {@link GetListByName }
     * 
     */
    public GetListByName createGetListByName() {
        return new GetListByName();
    }

    /**
     * Create an instance of {@link GetListByNameResponse }
     * 
     */
    public GetListByNameResponse createGetListByNameResponse() {
        return new GetListByNameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPersonIdentificationPersonIdentification }
     * 
     */
    public ArrayOfPersonIdentificationPersonIdentification createArrayOfPersonIdentificationPersonIdentification() {
        return new ArrayOfPersonIdentificationPersonIdentification();
    }

    /**
     * Create an instance of {@link LookupCity }
     * 
     */
    public LookupCity createLookupCity() {
        return new LookupCity();
    }

    /**
     * Create an instance of {@link LookupCityResponse }
     * 
     */
    public LookupCityResponse createLookupCityResponse() {
        return new LookupCityResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Mission }
     * 
     */
    public Mission createMission() {
        return new Mission();
    }

    /**
     * Create an instance of {@link MissionResponse }
     * 
     */
    public MissionResponse createMissionResponse() {
        return new MissionResponse();
    }

    /**
     * Create an instance of {@link com.example.consumingwebservice.wsdl.QueryByName }
     * 
     */
    public com.example.consumingwebservice.wsdl.QueryByName createQueryByName() {
        return new com.example.consumingwebservice.wsdl.QueryByName();
    }

    /**
     * Create an instance of {@link QueryByNameResponse }
     * 
     */
    public QueryByNameResponse createQueryByNameResponse() {
        return new QueryByNameResponse();
    }

    /**
     * Create an instance of {@link QueryByNameDataSet }
     * 
     */
    public QueryByNameDataSet createQueryByNameDataSet() {
        return new QueryByNameDataSet();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link ArrayOfFavoriteColorsItemString }
     * 
     */
    public ArrayOfFavoriteColorsItemString createArrayOfFavoriteColorsItemString() {
        return new ArrayOfFavoriteColorsItemString();
    }

    /**
     * Create an instance of {@link PersonIdentification }
     * 
     */
    public PersonIdentification createPersonIdentification() {
        return new PersonIdentification();
    }

    /**
     * Create an instance of {@link ByNameDataSet2 .ByName }
     * 
     */
    public ByNameDataSet2 .ByName createByNameDataSet2ByName() {
        return new ByNameDataSet2 .ByName();
    }

    /**
     * Create an instance of {@link QueryByNameDataSet2 .QueryByName }
     * 
     */
    public QueryByNameDataSet2 .QueryByName createQueryByNameDataSet2QueryByName() {
        return new QueryByNameDataSet2 .QueryByName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopLevelSimpleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopLevelSimpleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "simpleType")
    public JAXBElement<TopLevelSimpleType> createSimpleType(TopLevelSimpleType value) {
        return new JAXBElement<TopLevelSimpleType>(_SimpleType_QNAME, TopLevelSimpleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopLevelComplexType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopLevelComplexType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "complexType")
    public JAXBElement<TopLevelComplexType> createComplexType(TopLevelComplexType value) {
        return new JAXBElement<TopLevelComplexType>(_ComplexType_QNAME, TopLevelComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NamedGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "group")
    public JAXBElement<NamedGroup> createGroup(NamedGroup value) {
        return new JAXBElement<NamedGroup>(_Group_QNAME, NamedGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedAttributeGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NamedAttributeGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "attributeGroup")
    public JAXBElement<NamedAttributeGroup> createAttributeGroup(NamedAttributeGroup value) {
        return new JAXBElement<NamedAttributeGroup>(_AttributeGroup_QNAME, NamedAttributeGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopLevelElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopLevelElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "element")
    public JAXBElement<TopLevelElement> createElement(TopLevelElement value) {
        return new JAXBElement<TopLevelElement>(_Element_QNAME, TopLevelElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopLevelAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopLevelAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "attribute")
    public JAXBElement<TopLevelAttribute> createAttribute(TopLevelAttribute value) {
        return new JAXBElement<TopLevelAttribute>(_Attribute_QNAME, TopLevelAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wildcard }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Wildcard }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "anyAttribute")
    public JAXBElement<Wildcard> createAnyAttribute(Wildcard value) {
        return new JAXBElement<Wildcard>(_AnyAttribute_QNAME, Wildcard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link All }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link All }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "all")
    public JAXBElement<All> createAll(All value) {
        return new JAXBElement<All>(_All_QNAME, All.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "choice")
    public JAXBElement<ExplicitGroup> createChoice(ExplicitGroup value) {
        return new JAXBElement<ExplicitGroup>(_Choice_QNAME, ExplicitGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "sequence")
    public JAXBElement<ExplicitGroup> createSequence(ExplicitGroup value) {
        return new JAXBElement<ExplicitGroup>(_Sequence_QNAME, ExplicitGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "unique")
    public JAXBElement<Keybase> createUnique(Keybase value) {
        return new JAXBElement<Keybase>(_Unique_QNAME, Keybase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "key")
    public JAXBElement<Keybase> createKey(Keybase value) {
        return new JAXBElement<Keybase>(_Key_QNAME, Keybase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "minExclusive")
    public JAXBElement<Facet> createMinExclusive(Facet value) {
        return new JAXBElement<Facet>(_MinExclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "minInclusive")
    public JAXBElement<Facet> createMinInclusive(Facet value) {
        return new JAXBElement<Facet>(_MinInclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "maxExclusive")
    public JAXBElement<Facet> createMaxExclusive(Facet value) {
        return new JAXBElement<Facet>(_MaxExclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "maxInclusive")
    public JAXBElement<Facet> createMaxInclusive(Facet value) {
        return new JAXBElement<Facet>(_MaxInclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "fractionDigits")
    public JAXBElement<NumFacet> createFractionDigits(NumFacet value) {
        return new JAXBElement<NumFacet>(_FractionDigits_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "length")
    public JAXBElement<NumFacet> createLength(NumFacet value) {
        return new JAXBElement<NumFacet>(_Length_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "minLength")
    public JAXBElement<NumFacet> createMinLength(NumFacet value) {
        return new JAXBElement<NumFacet>(_MinLength_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "maxLength")
    public JAXBElement<NumFacet> createMaxLength(NumFacet value) {
        return new JAXBElement<NumFacet>(_MaxLength_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoFixedFacet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NoFixedFacet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "enumeration")
    public JAXBElement<NoFixedFacet> createEnumeration(NoFixedFacet value) {
        return new JAXBElement<NoFixedFacet>(_Enumeration_QNAME, NoFixedFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "element", scope = Group.class)
    public JAXBElement<LocalElement> createGroupElement(LocalElement value) {
        return new JAXBElement<LocalElement>(_Element_QNAME, LocalElement.class, Group.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupRef }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GroupRef }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "group", scope = Group.class)
    public JAXBElement<GroupRef> createGroupGroup(GroupRef value) {
        return new JAXBElement<GroupRef>(_Group_QNAME, GroupRef.class, Group.class, value);
    }

}
