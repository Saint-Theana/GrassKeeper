package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AddQuestContentProgressRsp {
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer contentType = null;
}
