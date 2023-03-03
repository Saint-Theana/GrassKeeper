package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestVarOp {
    @Tag(tag=9) public Integer index = null;
    @Tag(tag=5,isSigned=true) public Integer value = null;
    @Tag(tag=6) public Boolean isAdd = null;
}
