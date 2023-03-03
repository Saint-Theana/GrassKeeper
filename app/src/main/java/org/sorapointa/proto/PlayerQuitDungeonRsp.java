package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerQuitDungeonRsp {
    @Tag(tag=11) public Integer pointId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
