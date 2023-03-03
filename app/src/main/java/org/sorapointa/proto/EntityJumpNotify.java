package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EntityJumpNotify {
    public enum Type {
        @Tag(tag=0) TYPE_NULL ,
        @Tag(tag=1) TYPE_ACTIVE ,
        @Tag(tag=2) TYPE_PASSIVE ;
    }

    @Tag(tag=9) public Type jumpType = null;
    @Tag(tag=8) public Vector rot = null;
    @Tag(tag=10) public Vector pos = null;
    @Tag(tag=12) public Integer entityId = null;
}
