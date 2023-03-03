package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoRestartDungeonRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer dungeonId = null;
    @Tag(tag=12) public Integer pointId = null;
}
