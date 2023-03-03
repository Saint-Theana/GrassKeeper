package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MailData.*;
import org.sorapointa.proto.MailData;

public class GetAllMailRsp {
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<MailData> mailList = new ArrayList<>();
    @Tag(tag=1) public Boolean isCollected = null;
    @Tag(tag=2) public Boolean isTruncated = null;
}
