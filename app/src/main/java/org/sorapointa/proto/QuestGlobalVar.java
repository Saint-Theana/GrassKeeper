package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestGlobalVar {
    @Tag(tag=8,isSigned=true) public Integer value = null;
    @Tag(tag=4) public Integer key = null;
}
