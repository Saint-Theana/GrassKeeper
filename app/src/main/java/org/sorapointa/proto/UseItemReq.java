package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UseItemReq {
    @Tag(tag=13) public Integer count = null;
    @Tag(tag=14) public Long targetGuid = null;
    @Tag(tag=10) public Long guid = null;
    @Tag(tag=15) public Boolean isEnterMpDungeonTeam = null;
    @Tag(tag=7) public Integer optionIdx = null;
}
