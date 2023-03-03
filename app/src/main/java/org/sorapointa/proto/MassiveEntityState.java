package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MassiveEntityState {
    @Tag(tag=1) public Integer entityType = null;
    @Tag(tag=2,isSigned=true) public Long objId = null;
    @Tag(tag=3) public Integer elementState = null;
}
