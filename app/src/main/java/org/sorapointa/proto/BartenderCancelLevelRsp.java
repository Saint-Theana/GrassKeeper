package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderCancelLevelRsp {
    @Tag(tag=2) public Integer levelId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
