package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestTransmitRsp {
    @Tag(tag=12) public Integer pointId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer questId = null;
}
