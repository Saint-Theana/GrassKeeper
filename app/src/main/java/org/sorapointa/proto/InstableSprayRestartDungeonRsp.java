package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InstableSprayRestartDungeonRsp {
    @Tag(tag=1) public Integer levelId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
