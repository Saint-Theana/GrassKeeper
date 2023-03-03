package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeCompoundOutputReq {
    @Tag(tag=3) public Integer compoundGroupId = null;
    @Tag(tag=10) public Integer compoundId = null;
}
