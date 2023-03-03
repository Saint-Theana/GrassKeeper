package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RemoveCustomDungeonRsp {
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Long dungeonGuid = null;
}
