package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ServerBuff {
    @Tag(tag=1) public Integer serverBuffUid = null;
    @Tag(tag=2) public Integer serverBuffId = null;
    @Tag(tag=3) public Integer serverBuffType = null;
    @Tag(tag=4) public Integer instancedModifierId = null;
    @Tag(tag=5) public Boolean isModifierAdded = null;
}
