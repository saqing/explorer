/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables;


import io.trxplorer.model.Keys;
import io.trxplorer.model.Tmp;
import io.trxplorer.model.tables.records.NodeRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Node extends TableImpl<NodeRecord> {

    private static final long serialVersionUID = -1974957751;

    /**
     * The reference instance of <code>tmp.node</code>
     */
    public static final Node NODE = new Node();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NodeRecord> getRecordType() {
        return NodeRecord.class;
    }

    /**
     * The column <code>tmp.node.id</code>.
     */
    public final TableField<NodeRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.node.host</code>.
     */
    public final TableField<NodeRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>tmp.node.port</code>.
     */
    public final TableField<NodeRecord, Integer> PORT = createField("port", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>tmp.node.up</code>.
     */
    public final TableField<NodeRecord, Byte> UP = createField("up", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>tmp.node.longitude</code>.
     */
    public final TableField<NodeRecord, BigDecimal> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.DECIMAL.precision(11, 8), this, "");

    /**
     * The column <code>tmp.node.latitude</code>.
     */
    public final TableField<NodeRecord, BigDecimal> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 8), this, "");

    /**
     * The column <code>tmp.node.country_code</code>.
     */
    public final TableField<NodeRecord, String> COUNTRY_CODE = createField("country_code", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * The column <code>tmp.node.country</code>.
     */
    public final TableField<NodeRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>tmp.node.city</code>.
     */
    public final TableField<NodeRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(150), this, "");

    /**
     * The column <code>tmp.node.last_updated</code>.
     */
    public final TableField<NodeRecord, Timestamp> LAST_UPDATED = createField("last_updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>tmp.node.date_created</code>.
     */
    public final TableField<NodeRecord, Timestamp> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>tmp.node</code> table reference
     */
    public Node() {
        this("node", null);
    }

    /**
     * Create an aliased <code>tmp.node</code> table reference
     */
    public Node(String alias) {
        this(alias, NODE);
    }

    private Node(String alias, Table<NodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Node(String alias, Table<NodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Tmp.TMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<NodeRecord, ULong> getIdentity() {
        return Keys.IDENTITY_NODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NodeRecord> getPrimaryKey() {
        return Keys.KEY_NODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NodeRecord>> getKeys() {
        return Arrays.<UniqueKey<NodeRecord>>asList(Keys.KEY_NODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Node as(String alias) {
        return new Node(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Node rename(String name) {
        return new Node(name, null);
    }
}