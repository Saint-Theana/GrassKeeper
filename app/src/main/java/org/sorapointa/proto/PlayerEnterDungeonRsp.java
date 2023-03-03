package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerEnterDungeonRsp {
    @Tag(tag=2) public Integer dungeonId = null;
    @Tag(tag=6) public Integer pointId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
