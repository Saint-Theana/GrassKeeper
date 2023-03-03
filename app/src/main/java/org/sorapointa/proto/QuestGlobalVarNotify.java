package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.QuestGlobalVar.*;
import org.sorapointa.proto.QuestGlobalVar;

public class QuestGlobalVarNotify {
    @Tag(tag=1) public List<QuestGlobalVar> varList = new ArrayList<>();
}
