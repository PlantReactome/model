package org.reactome.web.pwp.model.client.classes;

import com.google.gwt.json.client.JSONObject;
import org.reactome.web.pwp.model.client.factory.DatabaseObjectUtils;
import org.reactome.web.pwp.model.client.factory.SchemaClass;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
@SuppressWarnings("UnusedDeclaration")
public abstract class AbstractModifiedResidue extends DatabaseObject {

    private ReferenceSequence referenceSequence;

    public AbstractModifiedResidue(SchemaClass schemaClass) {
        super(schemaClass);
    }

    @Override
    public void load(JSONObject jsonObject) {
        super.load(jsonObject);

//        setDatabaseObject(jsonObject, "referenceSequence", () -> referenceSequence = DatabaseObjectUtils.getDatabaseObject(jsonObject, "referenceSequence"));

        this.referenceSequence = DatabaseObjectUtils.getDatabaseObject(jsonObject, "referenceSequence");
    }

    public ReferenceSequence getReferenceSequence() {
        return referenceSequence;
    }
}
