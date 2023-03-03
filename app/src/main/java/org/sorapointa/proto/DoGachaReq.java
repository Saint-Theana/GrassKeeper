package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DoGachaReq {
    @Tag(tag=10) public Integer gachaTimes = null;
    @Tag(tag=7) public Integer gachaScheduleId = null;
    @Tag(tag=14) public Integer gachaType = null;
    @Tag(tag=13) public Integer gachaRandom = null;
    @Tag(tag=4) public String gachaTag = null;
}
