package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TryEnterHomeReq {
    @Tag(tag=3) public Integer targetUid = null;
    @Tag(tag=10) public Boolean isTransferToSafePoint = null;
    @Tag(tag=9) public Integer targetPoint = null;
}
