package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AssociateInferenceWordRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer baseWordId = null;
    @Tag(tag=13) public Integer associateWordId = null;
    @Tag(tag=1) public Integer pageId = null;
}
