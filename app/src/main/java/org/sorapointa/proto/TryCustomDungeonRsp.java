package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TryCustomDungeonRsp {
    @Tag(tag=4) public Integer roomId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
