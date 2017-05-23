/**
  *
  * Created by TaitoIto on 2017/05/23.
  */

import play.api.http.DefaultHttpFilters
import play.filters.csrf.CSRFFilter
import javax.inject.Inject

class Filters @Inject() (cSRFFilter: CSRFFilter)
  extends DefaultHttpFilters(cSRFFilter)