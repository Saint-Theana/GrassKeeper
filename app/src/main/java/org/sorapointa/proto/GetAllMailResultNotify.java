package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MailData.*;
import org.sorapointa.proto.MailData;

public class GetAllMailResultNotify {
    @Tag(tag=9) public String transaction = null;
    @Tag(tag=5) public List<MailData> mailList = new ArrayList<>();
    @Tag(tag=11) public Integer pageIndex = null;
    @Tag(tag=4) public Integer totalPageCount = null;
    @Tag(tag=7) public Boolean isCollected = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
