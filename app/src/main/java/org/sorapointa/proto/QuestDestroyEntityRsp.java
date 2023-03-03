package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestDestroyEntityRsp {
    @Tag(tag=14) public Integer questId = null;
    @Tag(tag=9) public Integer sceneId = null;
    @Tag(tag=12) public Integer entityId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
