package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestVarOp {
    @Tag(tag=14) public Integer index = null;
    @Tag(tag=6,isSigned=true) public Integer value = null;
    @Tag(tag=5) public Boolean isAdd = null;
}
