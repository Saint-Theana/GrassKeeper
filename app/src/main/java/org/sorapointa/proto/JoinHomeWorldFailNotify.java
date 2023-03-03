package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class JoinHomeWorldFailNotify {
    @Tag(tag=6) public Integer targetUid = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
