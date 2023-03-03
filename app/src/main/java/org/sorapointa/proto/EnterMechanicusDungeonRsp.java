package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterMechanicusDungeonRsp {
    @Tag(tag=12) public Integer wrongUid = null;
    @Tag(tag=13) public Integer difficultLevel = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer dungeonId = null;
}
