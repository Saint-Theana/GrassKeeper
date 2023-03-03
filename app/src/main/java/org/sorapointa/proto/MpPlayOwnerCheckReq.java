package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayOwnerCheckReq {
    @Tag(tag=9) public Integer mpPlayId = null;
    @Tag(tag=3) public Boolean isSkipMatch = null;
}
