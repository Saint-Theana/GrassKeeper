package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PhotoActivityFinishReq {
    @Tag(tag=15) public Integer posId = null;
    @Tag(tag=2) public Integer checkRootId = null;
    @Tag(tag=5) public Boolean isSucc = null;
}
