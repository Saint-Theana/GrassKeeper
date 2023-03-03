package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusCultivateRsp {
    @Tag(tag=4) public Integer cultivateId = null;
    @Tag(tag=13) public Boolean isNewRecord = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
