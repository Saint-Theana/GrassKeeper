package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OtherCustomDungeonBrief.*;
import org.sorapointa.proto.OtherCustomDungeonBrief;

public class SearchCustomDungeonRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public OtherCustomDungeonBrief customDungeonBrief = null;
}
