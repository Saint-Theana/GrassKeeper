package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Birthday.*;
import org.sorapointa.proto.Birthday;

public class SetPlayerBirthdayRsp {
    @Tag(tag=2) public Birthday birthday = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
