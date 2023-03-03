package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestTransmitReq {
    @Tag(tag=15) public Integer pointId = null;
    @Tag(tag=5) public Integer questId = null;
}
