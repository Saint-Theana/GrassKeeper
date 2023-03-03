package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CompoundBoostTakeStatusType {
        @Tag(tag=0) COMPOUND_BOOST_TAKE_STATUS_TYPE_NONE ,
        @Tag(tag=1) COMPOUND_BOOST_TAKE_STATUS_TYPE_BOOST_ONLY ,
        @Tag(tag=2) COMPOUND_BOOST_TAKE_STATUS_TYPE_BOOST_AND_TAKE ,
        @Tag(tag=3) COMPOUND_BOOST_TAKE_STATUS_TYPE_BAG_FULL ;
}
