package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InstableSprayEnterDungeonRsp {
    @Tag(tag=11) public Integer levelId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}